
package proyecto.Electro.Electro.service;

import java.util.List;
import java.util.Optional;
import proyecto.Electro.Electro.model.Usuario;


public interface UsuarioService {
    public Usuario save(Usuario usuario);
    public Optional<Usuario> get(Integer id);
    public void update(Usuario usuario);
    public void delete(Integer id);
    public List<Usuario> findAll();
    Optional<Usuario> findByUsername(String username);
}