package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.Publicacion;
import com.proyecto_final_g05.service.PublicacionService;
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
@RequestMapping("/publicacion")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var publicaciones = publicacionService.getPublicaciones();
        model.addAttribute("publicaciones", publicaciones);
        model.addAttribute("totalPublicaciones", publicaciones.size());
        return "/publicacion/listado";
    }

    @GetMapping("/eliminar/{idPublicacion}")
    public String eliminaPublicacion(Publicacion publicacion) {
        publicacionService.deletePublicacion(publicacion);
        return "redirect:/publicacion/listado";
    }

    @GetMapping("/modificar/{idPublicacion}")
    public String modificaPublicacion(Publicacion publicacion, Model model) {
        publicacion = publicacionService.getPublicacion(publicacion);
        model.addAttribute("publicacion", publicacion);
        return "/publicacion/modifica";
    }

    @GetMapping("/nuevo")
    public String nuevoPublicacion(Publicacion publicacion) {
        return "/publicacion/modifica";
    }

    @PostMapping("/guardar")
    public String guardarPublicacion(Publicacion publicacion) {
        publicacionService.savePublicacion(publicacion);
        return "redirect:/publicacion/listado";
    }

}
