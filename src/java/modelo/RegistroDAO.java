/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Keysi Ramirez
 */
public class RegistroDAO {
    
    Connection con;
    Conexion cn = new Conexion ();;
    PreparedStatement ps;
    ResultSet rs;
    int a;
    
    //@Override 
    public int Validar (Registro registro) {       
            
        String sql = "Select * from register where username=? and password=? and nombre=?";
        
        try {
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,registro.getUsername());
            ps.setString(2, registro.getPassword());
            ps.setString(3, registro.getName());
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                a = a + 1;
                
                registro.setUsername("username");
                registro.setPassword("password");
                registro.setName("nombre");
               
                   
            }
            
            if (a==1){
                
                return 1;
                
            } else {
                
                return 0;
                
            }
            
        } catch (Exception e){
            
            return 0;
            
        }
        
        
    }
    
}
