
package proyecto.Electro.Electro.model;


public class Marca {
      private Integer id;
    private String nombremarca;

    public Marca() {
    }

    public Marca(Integer id, String nombre) {
        this.id = id;
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
