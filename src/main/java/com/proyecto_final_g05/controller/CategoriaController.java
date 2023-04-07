package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Categoria;
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
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var categorias=categoriaService.getCategorias(false);
        model.addAttribute("categorias",categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }
            
    @GetMapping("/eliminar/{idCategoria}")
    public String eliminaCategoria(Categoria categoria){
        categoriaService.deleteCategoria(categoria);
        return "redirect:/categoria/listado";
    }
    
     @GetMapping("/modificar/{idCategoria}")
    public String modificaCategoria(Categoria categoria,Model model){
        categoria=categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoCategoria(Categoria categoria){
        return "/categoria/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarCategoria(Categoria categoria){
        categoriaService.saveCategoria(categoria);
        return "redirect:/categoria/listado";
    }
}
