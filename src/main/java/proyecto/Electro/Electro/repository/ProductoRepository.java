
package proyecto.Electro.Electro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.Electro.Electro.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
