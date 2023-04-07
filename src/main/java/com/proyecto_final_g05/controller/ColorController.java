package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Color;
import com.proyecto_final_g05.service.ColorService;
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
@RequestMapping("/color")
public class ColorController {
    
    @Autowired
    private ColorService colorService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var colors=colorService.getColors(false);
        model.addAttribute("colors",colors);
        model.addAttribute("totalColors", colors.size());
        return "/color/listado";
    }
            
    @GetMapping("/eliminar/{idColor}")
    public String eliminaColor(Color color){
        colorService.deleteColor(color);
        return "redirect:/color/listado";
    }
    
     @GetMapping("/modificar/{idColor}")
    public String modificaColor(Color color,Model model){
        color=colorService.getColor(color);
        model.addAttribute("color", color);
        return "/color/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoColor(Color color){
        return "/color/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarColor(Color color){
        colorService.saveColor(color);
        return "redirect:/color/listado";
    }
}
