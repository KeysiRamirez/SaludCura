
package modelo;

public class User {
    
    int idLogin;
    String user;
    String password;

    public User() {
    }

    public User(int idLogin, String user, String password) {
        this.idLogin = idLogin;
        this.user = user;
        this.password = password;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
        
    
}
