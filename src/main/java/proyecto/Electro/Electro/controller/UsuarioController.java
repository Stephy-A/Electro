package proyecto.Electro.Electro.controller;

import java.io.IOException;
import java.util.Optional;
import jakarta.servlet.http.HttpSession;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import proyecto.Electro.Electro.model.Usuario;
import proyecto.Electro.Electro.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public String vista(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuarios/usuario";
    }

    @GetMapping("/ucrear")
    public String create() {
        return "usuarios/ucrear";
    }

    @PostMapping("/save")
    public String save(Usuario usuario) {
        LOGGER.info("Este es el objeto usuario {}", usuario);
        usuarioService.save(usuario);
        Usuario u = new Usuario(Integer.SIZE, "", "", "", "", "", "");
        return "redirect:/usuarios";
    }

    @GetMapping("/login")
    public String login() {
        return "usuarios/login";
    }
    
    @PostMapping("/acceder")
    public String acceder(Usuario usuario){
        LOGGER.info("Acceso {}", usuario);
        Optional<Usuario> user=usuarioService.findByUsername(usuario.getUsername());
        LOGGER.info("Usuario de BD {}", user.get());
        return "redirect:/usuarios";
    }

    @GetMapping("/umodificar/{id}")
    public String umodificar(@PathVariable Integer id, Model model) {
        Usuario usuario = new Usuario();
        Optional<Usuario> optionalusuario = usuarioService.get(id);
        usuario = optionalusuario.get();

        LOGGER.info("usuario buscado: {}", usuario);
        model.addAttribute("usuario", usuario);

        return "usuarios/umodificar";
    }

    @PostMapping("/update")
    public String update(Usuario usuario) {
        usuarioService.update(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        usuarioService.delete(id);
        return "redirect:/usuarios";
    }

    @GetMapping("/uconsultar/{id}")
    public String uconsultar(@PathVariable Integer id, Model model) {
        Usuario usuario = new Usuario();
        Optional<Usuario> optionalusuario = usuarioService.get(id);
        usuario = optionalusuario.get();

        LOGGER.info("usuario buscado: {}", usuario);
        model.addAttribute("usuario", usuario);

        return "usuarios/uconsultar";
    }
}
