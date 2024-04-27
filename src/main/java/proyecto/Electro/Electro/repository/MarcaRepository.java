
package proyecto.Electro.Electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.Electro.Electro.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{
    
}
