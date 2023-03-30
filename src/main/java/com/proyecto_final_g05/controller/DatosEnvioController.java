
package com.proyecto_final_g05.controller;

import com.proyecto_final_g05.domain.DatosEnvio;
import com.proyecto_final_g05.service.DatosEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datosEnvio")
public class DatosEnvioController {
    
    @Autowired
    private DatosEnvioService datosEnvioService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var datosEnvios = datosEnvioService.getDatosEnvios();
        model.addAttribute("datosEnvios",datosEnvios);
        return "datosEnvio/listado";
    }
 
    @GetMapping("/eliminar/{idDatos}")
    public String eliminaDatosEnvio(DatosEnvio datosEnvio){
        datosEnvioService.deleteDatosEnvio(datosEnvio);
        return "redirect:/datosEnvio/listado";
    }
    
    @GetMapping("/nuevo")
    public String nuevoDatosEnvio(DatosEnvio datosEnvio){
        return "/datosEnvio/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarDatosEnvio(DatosEnvio datosEnvio){
        datosEnvioService.saveDatosEnvio(datosEnvio);
        return "redirect:/datosEnvio/listado";
    }
    
    @GetMapping("/modificar/{idDatos}")
    public String modificaDatosEnvio(DatosEnvio datosEnvio, Model model){
        datosEnvio = datosEnvioService.getDatosEnvio(datosEnvio);
        model.addAttribute("datosEnvio", datosEnvio);
        return "/datosEnvio/modifica";
    }


}
