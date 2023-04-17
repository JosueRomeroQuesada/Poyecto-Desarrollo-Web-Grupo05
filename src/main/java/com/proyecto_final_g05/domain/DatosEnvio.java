
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
    
    
    private String ciudad;
    private String calle; 

    public DatosEnvio( String ciudad, String calle) {
        
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public DatosEnvio() {
    }
    
    

    
   
    
}
