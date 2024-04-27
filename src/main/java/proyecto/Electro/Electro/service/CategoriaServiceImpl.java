
package proyecto.Electro.Electro.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.Electro.Electro.model.Categoria;
import proyecto.Electro.Electro.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public Categoria save(Categoria Categoria) {
        return categoriaRepository.save(Categoria);
    }

    @Override
    public Optional<Categoria> get(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void update(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Integer id) {
       categoriaRepository.deleteById(id);
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> listaCategoria() {
        return categoriaRepository.findAll();
    }
    
}