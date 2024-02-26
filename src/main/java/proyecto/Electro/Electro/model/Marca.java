package proyecto.Electro.Electro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombremarca;


    public Marca(Integer id, String nombremarca, Producto producto) {
        this.id = id;
        this.nombremarca = nombremarca;
    }

    public Marca() {
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombremarca;
    }

    public void setNombre(String nombre) {
        this.nombremarca = nombremarca;
    }

    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", nombre=" + nombremarca + '}';
    }

}
