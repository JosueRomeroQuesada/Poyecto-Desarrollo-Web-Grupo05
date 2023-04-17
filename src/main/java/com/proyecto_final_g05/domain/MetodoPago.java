package com.proyecto_final_g05.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author emers
 */
@Data
@Entity
@Table(name = " metodo_de_pago")
public class MetodoPago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo")
    private Long idMetodo;

    private String nombreTitular;
    private int numTarjeta; 
    private String fechaVencimiento;
    private int vcc;

    public MetodoPago() {
    }

    public MetodoPago(String nombreTitular, int numTarjeta, String fechaVencimiento, int vcc) {
        
        this.nombreTitular = nombreTitular;
        this.numTarjeta = numTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.vcc = vcc;
    }
    
    
   
    
 
    

    

}
