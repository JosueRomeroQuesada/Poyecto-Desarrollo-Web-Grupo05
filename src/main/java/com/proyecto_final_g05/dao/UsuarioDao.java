
package com.proyecto_final_g05.dao;

import com.proyecto_final_g05.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
}
