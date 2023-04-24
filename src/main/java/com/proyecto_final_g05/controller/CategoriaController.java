package com.proyecto_final_g05.controller;

/*import com.proyecto_final_g05.domain.Categoria;*/
import com.proyecto_final_g05.domain.Categoria;
import com.proyecto_final_g05.service.ArticuloService;
import com.proyecto_final_g05.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author emers
 */
@Controller
@RequestMapping("/cartucheras")
public class CategoriaController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var articulos = articuloService.getArticulos(false);
        model.addAttribute("articulos", articulos);
        model.addAttribute("totalArticulos", articulos.size());
        return "cartucheras/listado";
    }
}
 m