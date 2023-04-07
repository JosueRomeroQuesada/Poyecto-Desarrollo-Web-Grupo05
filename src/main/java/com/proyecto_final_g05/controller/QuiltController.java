package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Quilt;
import com.proyecto_final_g05.service.QuiltService;
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
@RequestMapping("/quilt")
public class QuiltController {
    
    @Autowired
    private QuiltService quiltService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var quilts=quiltService.getQuilts(false);
        model.addAttribute("quilts",quilts);
        model.addAttribute("totalQuilts", quilts.size());
        return "/quilt/listado";
    }
            
    @GetMapping("/eliminar/{idQuilt}")
    public String eliminaQuilt(Quilt quilt){
        quiltService.deleteQuilt(quilt);
        return "redirect:/quilt/listado";
    }
    
     @GetMapping("/modificar/{idQuilt}")
    public String modificaQuilt(Quilt quilt,Model model){
        quilt=quiltService.getQuilt(quilt);
        model.addAttribute("quilt", quilt);
        return "/quilt/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoQuilt(Quilt quilt){
        return "/quilt/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarQuilt(Quilt quilt){
        quiltService.saveQuilt(quilt);
        return "redirect:/quilt/listado";
    }
}
