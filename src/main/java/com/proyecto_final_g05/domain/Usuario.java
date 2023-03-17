
package com.proyecto_final_g05.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Table (name="usuario")
@Entity
@Data


public class Usuario implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cedula;
    
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento; 
    private String correo;
    private String telefono;
    private String provincia;
    private String canton;
    private String distrito;
    private String otrasSenas;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, Date fechaNacimiento, String correo, String telefono, String provincia, String canton, String distrito, String otrasSenas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.otrasSenas = otrasSenas;
    }
    
}
