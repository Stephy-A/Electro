
package proyecto.Electro.Electro.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Entity
@Table (name="Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
    private String nombreproducto;
    private double precio;
    LocalDate fecha = LocalDate.now();
    private String caracteristica;
    private String imagen;
    private String componente;
    private String detalle;
    
  /* @ManyToOne 
   @JoinColumn(name = "idUsuario")
    private Usuario usuario;*/
    @ManyToOne 
    @JoinColumn(name = "idMarca")
    private Marca marca;

    @ManyToOne 
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
   

    public Producto() {
    }

    public Producto(Integer id, String nombreproducto, double precio, String caracteristica, String imagen, String componente, String detalle, Marca marca, Categoria categoria) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.caracteristica = caracteristica;
        this.imagen = imagen;
        this.componente = componente;
        this.detalle = detalle;
        this.marca = marca;
        this.categoria = categoria;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreproducto=" + nombreproducto + ", precio=" + precio + ", fecha=" + fecha + ", caracteristica=" + caracteristica + ", componente=" + componente + ", detalle=" + detalle + ", marca=" + marca + ", categoria=" + categoria + '}';
    }

}