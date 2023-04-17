package com.proyecto_final_g05.controller;


import com.proyecto_final_g05.domain.MetodoPago;
import com.proyecto_final_g05.service.MetodoPagoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/metodoPago")
public class MetodoPagoController {
    
    @Autowired
    private MetodoPagoService metodoPagoService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var metodoPagos=metodoPagoService.getMetodoPagos();
        model.addAttribute("metodoPagos",metodoPagos);
        model.addAttribute("totalMetodoPagos", metodoPagos.size());
        return "/metodoPago/listado";
    }
            
    @GetMapping("/eliminar/{idMetodoPago}")
    public String eliminaMetodoPago(MetodoPago metodoPago){
        metodoPagoService.deleteMetodoPago(metodoPago);
        return "redirect:/metodoPago/listado";
    }
    
     @GetMapping("/modificar/{idMetodoPago}")
    public String modificaMetodoPago(MetodoPago metodoPago,Model model){
        metodoPago=metodoPagoService.getMetodoPago(metodoPago);
        model.addAttribute("metodoPago", metodoPago);
        return "/metodoPago/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoMetodoPago(MetodoPago metodoPago){
        return "/metodoPago/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarMetodoPago(MetodoPago metodoPago){
        metodoPagoService.saveMetodoPago(metodoPago);
        return "redirect:/metodoPago/listado";
    }
    
    
   
}
