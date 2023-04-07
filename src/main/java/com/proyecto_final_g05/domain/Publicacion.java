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
@Table(name = "publicacion")
public class Publicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacion")
    private Long idPublicacion;
    
    private String titular;
    private String imagen;

    public Publicacion() {
    }

    public Publicacion(String titular, String imagen) {
        this.titular = titular;
        this.imagen = imagen;
    }

    
    

}
