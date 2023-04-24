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
@Table(name = "articulo")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long idArticulo;

    private String descripcion;
    private String detalle; 
    private double precio;
    private int existencias;
    private String imagen;
    private String categoria;
    private boolean activo;

    

    public Articulo() {
    }

    public Articulo(String descripcion, String detalle, double precio, int existencias, String imagen, String categoria, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.imagen = imagen;
        this.categoria = categoria;
        this.activo = activo;
    }

    
    

    

}
