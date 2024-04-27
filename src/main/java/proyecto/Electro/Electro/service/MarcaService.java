
package proyecto.Electro.Electro.service;

import java.util.List;
import java.util.Optional;
import proyecto.Electro.Electro.model.Marca;


public interface MarcaService {
    public Marca save(Marca marca);
    public Optional<Marca> get(Integer id);
    public void update(Marca marca);
    public void delete(Integer id);
    public List<Marca> findAll();
    public abstract List<Marca> listaMarca();
}