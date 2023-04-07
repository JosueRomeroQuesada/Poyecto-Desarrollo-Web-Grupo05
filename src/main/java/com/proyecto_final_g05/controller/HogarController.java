package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Hogar;
import com.proyecto_final_g05.service.HogarService;
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
@RequestMapping("/hogar")
public class HogarController {
    
    @Autowired
    private HogarService hogarService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var hogars=hogarService.getHogars(false);
        model.addAttribute("hogars",hogars);
        model.addAttribute("totalHogars", hogars.size());
        return "/hogar/listado";
    }
            
    @GetMapping("/eliminar/{idHogar}")
    public String eliminaHogar(Hogar hogar){
        hogarService.deleteHogar(hogar);
        return "redirect:/hogar/listado";
    }
    
     @GetMapping("/modificar/{idHogar}")
    public String modificaHogar(Hogar hogar,Model model){
        hogar=hogarService.getHogar(hogar);
        model.addAttribute("hogar", hogar);
        return "/hogar/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoHogar(Hogar hogar){
        return "/hogar/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarHogar(Hogar hogar){
        hogarService.saveHogar(hogar);
        return "redirect:/hogar/listado";
    }
}
