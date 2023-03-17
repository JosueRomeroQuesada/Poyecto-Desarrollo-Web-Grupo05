
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
 
    @GetMapping("/eliminar/{cedula}")
    public String eliminaUsuario(Usuario usuario){
        usuarioService.deleteUsuario(usuario);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/nuevo")
    public String nuevoUsuario(Usuario usuario){
        return "/usuario/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarUsuario(Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/modificar/{cedula}")
    public String modificaUsuario(Usuario usuario, Model model){
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modifica";
    }


}
