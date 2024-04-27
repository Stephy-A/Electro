package proyecto.Electro.Electro.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import proyecto.Electro.Electro.model.Categoria;
import proyecto.Electro.Electro.model.Marca;
import proyecto.Electro.Electro.model.Producto;
import proyecto.Electro.Electro.service.CategoriaService;
import proyecto.Electro.Electro.service.MarcaService;
import proyecto.Electro.Electro.service.ProductoService;
import proyecto.Electro.Electro.service.UploadFileService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private MarcaService marcaService;

    @Autowired
    private UploadFileService upload;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @GetMapping("")
    public String vista(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "productos/vista";
    }

    @GetMapping("/pcrear")
    public String create(Model model) {
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        List<Marca> marcas = marcaService.findAll();
        model.addAttribute("marcas", marcas);
        model.addAttribute("producto", new Producto());

        return "productos/pcrear";
    }

    @RequestMapping("/cargaCategoria")
    @ResponseBody
    public List<Categoria> listaCategoria() {
        return categoriaService.listaCategoria();

    }

    @PostMapping("/save")
    public String save(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
        LOGGER.info("Este es el objeto producto {}", producto);

        //imagen
        if (producto.getId() == null) { // cuando se crea un producto
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        } else {

        }
        productoService.save(producto);
        return "redirect:/productos";
    }

    @GetMapping("/pmodificar/{id}")
    public String pmodificar(@PathVariable Integer id, Model model) {
        Producto producto = new Producto();
        Optional<Producto> optionalproducto = productoService.get(id);
        producto = optionalproducto.get();
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        List<Marca> marcas = marcaService.findAll();
        model.addAttribute("marcas", marcas);
        model.addAttribute("producto", new Producto());
        LOGGER.info("producto buscado: {}", producto);
        model.addAttribute("producto", producto);

        return "productos/pmodificar";
    }

    @PostMapping("/update")
    public String update(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
        Producto p = new Producto();
        p = productoService.get(producto.getId()).get();
        
        if (file.isEmpty()) {

            producto.setImagen(p.getImagen());
        } else {

            //eliminar cuando no sea la imagen por defecto
            if (!p.getImagen().equals("default.png")) {
                upload.deleteImage(p.getImagen());
            }
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        }
        productoService.update(producto);
        return "redirect:/productos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Producto p = new Producto();
        p = productoService.get(id).get();

        //eliminar cuando no sea la imagen por defecto
        if (!p.getImagen().equals("default.png")) {
            upload.deleteImage(p.getImagen());
        }
        productoService.delete(id);
        return "redirect:/productos";
    }

    @GetMapping("/pconsultar/{id}")
    public String pconsultar(@PathVariable Integer id, Model model) {
        Producto producto = new Producto();
        Optional<Producto> optionalproducto = productoService.get(id);
        producto = optionalproducto.get();

        LOGGER.info("producto buscado: {}", producto);
        model.addAttribute("producto", producto);

        return "productos/pconsultar";
    }
}
