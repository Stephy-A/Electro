
package proyecto.Electro.Electro.controller;

import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import proyecto.Electro.Electro.model.Categoria;
import proyecto.Electro.Electro.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    private final Logger LOGGER = LoggerFactory.getLogger(CategoriaController.class);
    
      @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("")
    public String vista(Model model){
        model.addAttribute("categorias", categoriaService.findAll());
        return "categorias/categoria";
    }
    @GetMapping("/ccrear")
    public String create(){
        return"categorias/ccrear";
    }
    @PostMapping("/save")
    public String save(Categoria categoria){
        LOGGER.info("Este es el objeto categoria {}", categoria);
        categoriaService.save(categoria);
        Categoria c= new Categoria(Integer.SIZE, "");
        return "redirect:/categorias";
    }
    @GetMapping("/cmodificar/{id}")
public String cmodificar(@PathVariable Integer id, Model model) {
    Categoria categoria= new Categoria();
    Optional<Categoria> optionalcategoria=categoriaService.get(id);
    categoria= optionalcategoria.get();
    
    LOGGER.info("categoria buscado: {}",categoria);
    model.addAttribute("categoria", categoria);
    
    return "categorias/cmodificar";
}
@PostMapping("/update")
public String update(Categoria categoria){
    categoriaService.update(categoria);
    return "redirect:/categorias";
}
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        categoriaService.delete(id);
        return "redirect:/categorias";
    }
    @GetMapping("/cconsultar/{id}")
public String cconsultar(@PathVariable Integer id, Model model) {
    Categoria categoria= new Categoria();
    Optional<Categoria> optionalcategoria=categoriaService.get(id);
    categoria= optionalcategoria.get();
    
    LOGGER.info("categoria buscado: {}",categoria);
    model.addAttribute("categoria", categoria);
    
    return "categorias/cconsultar";
}
}
