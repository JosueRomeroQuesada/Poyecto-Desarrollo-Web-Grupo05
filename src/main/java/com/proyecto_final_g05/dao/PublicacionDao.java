package com.proyecto_final_g05.dao;

import com.proyecto_final_g05.domain.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface PublicacionDao extends JpaRepository<Publicacion,Long>{
    
}
