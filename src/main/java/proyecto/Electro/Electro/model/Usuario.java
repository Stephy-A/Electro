
package proyecto.Electro.Electro.model;



public class Usuario {
    
    private Integer id;
    private String nombre;
    private String apellido;
    private String username;
    private String correo;
    private String password;
    private String tipo;

    public Usuario() {
    }

    
    public Usuario(Integer Id, String nombre, String apellido, String username, String correo, String password, String tipo) {
        this.id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.tipo = tipo;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", username=" + username + ", correo=" + correo + ", password=" + password + ", tipo=" + tipo + '}';
    }
    
    
}
