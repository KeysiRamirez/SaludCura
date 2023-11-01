
package com.jp.bean;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped; 

import com.jp.db.DBOperation;


@ManagedBean @RequestScoped 
public class UserBean {

	private int IdMedico;  
	private String nombre;  
	private int cedula;  
	private String tanda;  
	private String especialidad;  
	private boolean estado;

	public ArrayList<UserBean>usersListFromDB;

    public int getIdMedico() {
        return IdMedico;
    }

    public void setIdMedico(int IdMedico) {
        this.IdMedico = IdMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTanda() {
        return tanda;
    }

    public void setTanda(String tanda) {
        this.tanda = tanda;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<UserBean> getUsersListFromDB() {
        return usersListFromDB;
    }

    public void setUsersListFromDB(ArrayList<UserBean> usersListFromDB) {
        this.usersListFromDB = usersListFromDB;
    }
    
        @PostConstruct
	public void init() {
		usersListFromDB = DBOperation.getUsersListFromDB();
	}

	/* Method Used To Fetch All Records From The Database */
	public ArrayList<UserBean> usersList() {
		return usersListFromDB;
	}
	
	/* Method Used To Save New User Record */
	public String saveUserDetails(UserBean newUserObj) {
		return DBOperation.saveUserDetailsInDB(newUserObj);
	}
	
	/* Method Used To Edit User Record */
	public String editUserRecord(int medicoId) {
		return DBOperation.editUserRecordInDB(medicoId);
	}
	
	/* Method Used To Update User Record */
	public String updateUserDetails(UserBean updateUserObj) {
		return DBOperation.updateUserDetailsInDB(updateUserObj);
	}
	
	/* Method Used To Delete User Record */
	public String deleteUserRecord(int medicoId) {
		return DBOperation.deleteUserRecordInDB(medicoId);
	}
}

