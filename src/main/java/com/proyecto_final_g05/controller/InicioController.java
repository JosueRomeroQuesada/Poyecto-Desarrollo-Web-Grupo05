package com.proyecto_final_g05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author emers
 */
@Controller
public class InicioController {
    
    @GetMapping("/")
    public String inicio(Model model){      
        return "Inicio";
    }
    @GetMapping("/maps")
    public String inicio(){      
        return "maps";
    }
}
