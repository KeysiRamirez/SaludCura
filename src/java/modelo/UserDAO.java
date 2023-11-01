
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO implements Validar{
    
    Connection con;
    Conexion cn = new Conexion ();;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    @Override 
    public int Validar (User user) {       
            
        String sql = "Select * from login where username=? and password=?";
        
        try {
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,user.getUser());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                r = r + 1;
                
                user.setUser(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                   
            }
            
            if (r==1){
                
                return 1;
                
            } else {
                
                return 0;
                
            }
            
        } catch (Exception e){
            
            return 0;
        }
        
        
    }
}
