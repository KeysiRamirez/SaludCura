
package modelo;


public class Registro {
    
    private int idRegistro;
    private String username;
    private String password;
    private String name;

    public Registro() {
    }

    public Registro(int idRegistro, String username, String password, String name) {
        this.idRegistro = idRegistro;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}


