
package proyecto.Electro.Electro.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    private Date fechalanzamiento;
    private String caracteristica;
    private String componente;
    private String detalle;
    
   @ManyToOne (cascade = CascadeType.ALL, optional = true)
    private Usuario usuario;
    @ManyToOne (cascade = CascadeType.ALL, optional = true)
    private Marca marca;

    @ManyToOne(cascade = CascadeType.ALL, optional = true)
    private Categoria categoria;;
   

    public Producto() {
    }

    public Producto(Integer id, String nombreproducto, double precio, Date fechalanzamiento, String caracteristica, String componente, String detalle, Usuario usuario, Marca marca, Categoria categoria) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.fechalanzamiento = fechalanzamiento;
        this.caracteristica = caracteristica;
        this.componente = componente;
        this.detalle = detalle;
        this.usuario = usuario;
        this.marca = marca;
        this.categoria = categoria;
    }

    

   


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreproducto;
    }

    public void setNombre(String nombre) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
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

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombreproducto + ", precio=" + precio + ", fechalanzamiento=" + fechalanzamiento + ", caracteristica=" + caracteristica + ", componente=" + componente + ", detalle=" + detalle + '}';
    }

    
}
