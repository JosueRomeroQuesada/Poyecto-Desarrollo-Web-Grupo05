package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Cartuchera;
import com.proyecto_final_g05.service.CartucheraService;
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
@RequestMapping("/cartuchera")
public class CartucheraController {
    
    @Autowired
    private CartucheraService cartucheraService;

    @GetMapping("/listado")
    public String inicio(Model model){  
        var cartucheras=cartucheraService.getCartucheras(false);
        model.addAttribute("cartucheras",cartucheras);
        model.addAttribute("totalCartucheras", cartucheras.size());
        return "/cartuchera/listado";
    }
            
    @GetMapping("/eliminar/{idCartuchera}")
    public String eliminaCartuchera(Cartuchera cartuchera){
        cartucheraService.deleteCartuchera(cartuchera);
        return "redirect:/cartuchera/listado";
    }
    
     @GetMapping("/modificar/{idCartuchera}")
    public String modificaCartuchera(Cartuchera cartuchera,Model model){
        cartuchera=cartucheraService.getCartuchera(cartuchera);
        model.addAttribute("cartuchera", cartuchera);
        return "/cartuchera/modifica";
    }
    
    
    
    @GetMapping("/nuevo")
    public String nuevoCartuchera(Cartuchera cartuchera){
        return "/cartuchera/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarCartuchera(Cartuchera cartuchera){
        cartucheraService.saveCartuchera(cartuchera);
        return "redirect:/cartuchera/listado";
    }
}
