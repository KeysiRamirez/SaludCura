package com.jp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList; 
import java.util.Map;

import javax.faces.context.FacesContext;

import com.jp.bean.UserBean;

public class DBOperation {

	public static Statement stmtObj;
	public static Connection connObj;
	public static ResultSet resultSetObj;
	public static PreparedStatement pstmt;

	/* Method To Establish Database Connection */
	public static Connection getConnection(){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");     
			String db_url ="jdbc:mysql://localhost:3306/dispensariomedico?serverTimezone=UTC",
					db_userName = "root",
					db_password = "";
			connObj = DriverManager.getConnection(db_url,db_userName,db_password);  
		} catch(Exception sqlException) {  
			sqlException.printStackTrace();
		}  
		return connObj;
	}

	/* Method To Fetch The User Records From Database */
	public static ArrayList<UserBean> getUsersListFromDB() {
		ArrayList<UserBean> usersList = new ArrayList<UserBean>();  
		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from dispensariomedico");    
			while(resultSetObj.next()) {  
				UserBean usrObj = new UserBean(); 
				usrObj.setIdMedico(resultSetObj.getInt("idMedico"));  
				usrObj.setNombre(resultSetObj.getString("Nombre"));  
				usrObj.setCedula(resultSetObj.getInt("Cedula"));  
				usrObj.setTanda(resultSetObj.getString("Tanda"));  
				usrObj.setEspecialidad(resultSetObj.getString("Especialidad"));  
				usrObj.setEstado(resultSetObj.getBoolean("Estado"));  
				usersList.add(usrObj);  
			}   
			System.out.println("Cantidad de registros cargados: " + usersList.size());
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		} 
		return usersList;
	}

	/* Method Used To Save New User Record In Database */
	public static String saveUserDetailsInDB(UserBean newUserObj) {
		int saveResult = 0;
		String navigationResult = "";
		try {      
			pstmt = getConnection().prepareStatement("insert into Usuarios (Nombre, Email, Clave, Genero, Direccion) values (?, ?, ?, ?, ?)");			
			pstmt.setString(1, newUserObj.getNombre());
			pstmt.setInt(2, newUserObj.getCedula());
			pstmt.setString(3, newUserObj.getTanda());
			pstmt.setString(4, newUserObj.getEspecialidad());
			pstmt.setBoolean(5, newUserObj.isEstado());
			saveResult = pstmt.executeUpdate();
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		if(saveResult !=0) {
			navigationResult = "usersList.xhtml?faces-redirect=true";
		} else {
			navigationResult = "createUser.xhtml?faces-redirect=true";
		}
		return navigationResult;
	}

	/* Method Used To Edit User Record In Database */
	public static String editUserRecordInDB(int medicoId) {
		UserBean editRecord = null;
		System.out.println("editUserRecordInDB() : Medico Id: " + medicoId);

		/* Setting The Particular User Details In Session */
		Map<String,Object> sessionMapObj = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from Usuarios where IdMedico = "+medicoId);    
			if(resultSetObj != null) {
				resultSetObj.next();
				editRecord = new UserBean(); 
				editRecord.setIdMedico(resultSetObj.getInt("IdMedico"));
				editRecord.setNombre(resultSetObj.getString("Nombre"));
				editRecord.setCedula(resultSetObj.getInt	("Cedula"));
				editRecord.setTanda(resultSetObj.getString("Tanda")); 
				editRecord.setEspecialidad(resultSetObj.getString("Especialidad"));
				editRecord.setEstado(resultSetObj.getBoolean("Estado"));
			}
			sessionMapObj.put("editRecordObj", editRecord);
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/editUser.xhtml?faces-redirect=true";
	}

	/* Method Used To Update User Record In Database */
	public static String updateUserDetailsInDB(UserBean updateUserObj) {
		try {
			pstmt = getConnection().prepareStatement("update Medico set Nombre=?, Cedula=?, Tanda=?, Especialidad=?, Estado=? where IdMedico=?");    
			pstmt.setString(1,updateUserObj.getNombre());  
			pstmt.setInt(2,updateUserObj.getCedula());  
			pstmt.setString(3,updateUserObj.getTanda());  
			pstmt.setString(4,updateUserObj.getEspecialidad());  
			pstmt.setBoolean(5,updateUserObj.isEstado());  
			pstmt.setInt(6,updateUserObj.getIdMedico());  
			pstmt.executeUpdate();
			connObj.close();			
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/usersList.xhtml?faces-redirect=true";
	}

	/* Method Used To Delete User Record From Database */
	public static String deleteUserRecordInDB(int medicoId){
		System.out.println("deleteUserRecordInDB() : Medio Id: " + medicoId);
		try {
			pstmt = getConnection().prepareStatement("delete from Usuarios where IdMedico = "+medicoId);  
			pstmt.executeUpdate();  
			connObj.close();
		} catch(Exception sqlException){
			sqlException.printStackTrace();
		}
		return "/usersList.xhtml?faces-redirect=true";
	}
}
