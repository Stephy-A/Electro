
package proyecto.Electro.Electro.model;

import java.util.Date;

public class Producto {
     private Integer id;
    private String nombreproducto;
    private double precio;
    private Date fechalanzamiento;
    private String caracteristica;
    private String componente;
    private String detalle;

    public Producto() {
    }

    public Producto(Integer id, String nombre, double precio, Date fechalanzamiento, String caracteristica, String componente, String detalle) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.fechalanzamiento = fechalanzamiento;
        this.caracteristica = caracteristica;
        this.componente = componente;
        this.detalle = detalle;
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

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombreproducto + ", precio=" + precio + ", fechalanzamiento=" + fechalanzamiento + ", caracteristica=" + caracteristica + ", componente=" + componente + ", detalle=" + detalle + '}';
    }

    
}
