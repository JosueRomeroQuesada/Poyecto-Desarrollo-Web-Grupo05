
package com.proyecto_final_g05.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Table (name="datosEnvio")
@Entity
@Data


public class DatosEnvio implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDatos;
    
    private String provincia;
    private String ciudad;
    private Date calle; 

    public DatosEnvio(String provincia, String ciudad, Date calle) {
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public DatosEnvio() {
    }
    
    

    
   
    
}
