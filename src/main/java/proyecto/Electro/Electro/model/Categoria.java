package proyecto.Electro.Electro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombrecategoria;


    public Categoria() {
    }

    public Categoria(Integer id, String nombrecategoria, Producto producto) {
        this.id = id;
        this.nombrecategoria = nombrecategoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }


    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombrecategoria=" + nombrecategoria + '}';
    }

}
