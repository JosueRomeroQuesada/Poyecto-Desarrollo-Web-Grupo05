package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author emers
 */
@Controller
public class IndexController {
    
    @Autowired
    private PublicacionService publicacionService;
    
    @GetMapping("/")
    public String inicio(Model model){ 
        var publicaciones=publicacionService.getPublicaciones();
        model.addAttribute("publicaciones",publicaciones);
        
        return "index";
    }


    

}
