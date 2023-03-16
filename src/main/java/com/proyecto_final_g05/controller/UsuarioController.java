
package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Usuario;
import com.proyecto_final_g05.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "usuario/listado";
    }
 

}
