
package proyecto.Electro.Electro.model;

public class Imagen {
    private Integer id;
    private String nombreimagen;
    private String imagen;

    public Imagen() {
    }

    public Imagen(Integer id, String nombre, String imagen) {
        this.id = id;
        this.nombreimagen = nombreimagen;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreimagen;
    }

    public void setNombre(String nombre) {
        this.nombreimagen = nombreimagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", nombre=" + nombreimagen + ", imagen=" + imagen + '}';
    }
    
    
}
