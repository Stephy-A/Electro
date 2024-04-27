
package proyecto.Electro.Electro.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.Electro.Electro.model.Marca;
import proyecto.Electro.Electro.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;
    @Override
    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Optional<Marca> get(Integer id) {
        return marcaRepository.findById(id);
    }

    @Override
    public void update(Marca marca) {
        marcaRepository.save(marca);
    }

    @Override
    public void delete(Integer id) {
       marcaRepository.deleteById(id);
    }

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public List<Marca> listaMarca() {
        return marcaRepository.findAll();
    }
    
}