
package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Monedero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto_final_g05.service.MonederoService;

@Controller
@RequestMapping("/monedero")
public class MonederoController {
    
    @Autowired
    private MonederoService monederoService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var monederos=monederoService.getMonederos(false);
        model.addAttribute("monederos",monederos);
        model.addAttribute("totalMonederos", monederos.size());
        return "/monedero/listado";
    }
            
    @GetMapping("/eliminar/{idMonedero}")
    public String eliminaMonedero(Monedero monedero){
        monederoService.deleteMonedero(monedero);
        return "redirect:/monedero/listado";
    }
    
     @GetMapping("/modificar/{idMonedero}")
    public String modificaMonedero(Monedero monedero,Model model){
        monedero=monederoService.getMonedero(monedero);
        model.addAttribute("monedero", monedero);
        return "/monedero/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoMonedero(Monedero monedero){
        return "/monedero/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarMonedero(Monedero monedero){
        monederoService.saveMonedero(monedero);
        return "redirect:/monedero/listado";
    }
}