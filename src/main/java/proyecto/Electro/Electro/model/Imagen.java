
package proyecto.Electro.Electro.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Imagenes")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreimagen;
    private String foto;
    
     @ManyToOne(cascade = CascadeType.ALL, optional = true)
    private Producto producto;
    public Imagen() {
    }

    public Imagen(Integer id, String nombreimagen, String foto, Producto producto) {
        this.id = id;
        this.nombreimagen = nombreimagen;
        this.foto = foto;
        this.producto = producto;
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


    public String getNombreimagen() {
        return nombreimagen;
    }

    public void setNombreimagen(String nombreimagen) {
        this.nombreimagen = nombreimagen;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    @Override
    public String toString() {
        return "Imagen{" + "id=" + id + ", nombre=" + nombreimagen + ", imagen=" + foto + '}';
    }
    
    
}
