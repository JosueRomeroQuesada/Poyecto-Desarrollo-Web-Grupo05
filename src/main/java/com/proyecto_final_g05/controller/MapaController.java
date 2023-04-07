package com.proyecto_final_g05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author emers
 */
@Controller
public class MapaController {
    
    @GetMapping("/maps")
    public String inicio(){  
        
        return "maps";
    }
    
}
