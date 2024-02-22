
package proyecto.Electro.Electro.model;

public class Categoria {
     private Integer id;
    private String nombrecategoria;

    public Categoria() {
    }

    public Categoria(Integer id, String nombrecategoria) {
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
