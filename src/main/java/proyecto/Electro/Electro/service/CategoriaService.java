
package proyecto.Electro.Electro.service;

import java.util.List;
import java.util.Optional;
import proyecto.Electro.Electro.model.Categoria;


public interface CategoriaService {
    public Categoria save(Categoria categoria);
    public Optional<Categoria> get(Integer id);
    public void update(Categoria categoria);
    public void delete(Integer id);
    public List<Categoria> findAll();
    public abstract List<Categoria> listaCategoria();
}