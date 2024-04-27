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
import proyecto.Electro.Electro.model.Marca;
import proyecto.Electro.Electro.service.MarcaService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

    private final Logger LOGGER = LoggerFactory.getLogger(MarcaController.class);

    @Autowired
    private MarcaService marcaService;

    @GetMapping("")
    public String vista(Model model) {
        model.addAttribute("marcas", marcaService.findAll());
        return "marcas/marca";
    }

    @GetMapping("/mcrear")
    public String create() {
        return "marcas/mcrear";
    }

    @PostMapping("/save")
    public String save(Marca marca) {
        LOGGER.info("Este es el objeto marca {}", marca);
        marcaService.save(marca);
        Marca m = new Marca(Integer.SIZE, "");
        return "redirect:/marcas";
    }

    @GetMapping("/mmodificar/{id}")
    public String mmodificar(@PathVariable Integer id, Model model) {
        Marca marca = new Marca();
        Optional<Marca> optionalmarca = marcaService.get(id);
        marca = optionalmarca.get();

        LOGGER.info("marca buscado: {}", marca);
        model.addAttribute("marca", marca);

        return "marcas/mmodificar";
    }

    @PostMapping("/update")
    public String update(Marca marca) {
        marcaService.update(marca);
        return "redirect:/marcas";
    }

    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        marcaService.delete(id);
        return "redirect:/marcas";
    }

    @GetMapping("/mconsultar/{id}")
    public String mconsultar(@PathVariable Integer id, Model model) {
        Marca marca = new Marca();
        Optional<Marca> optionalmarca = marcaService.get(id);
        marca = optionalmarca.get();

        LOGGER.info("marca buscado: {}", marca);
        model.addAttribute("marca", marca);

        return "marcas/mconsultar";
    }
}
