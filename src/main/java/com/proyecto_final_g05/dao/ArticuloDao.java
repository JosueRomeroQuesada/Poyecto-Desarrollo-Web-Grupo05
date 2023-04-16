package com.proyecto_final_g05.dao;


import com.proyecto_final_g05.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface ArticuloDao extends JpaRepository<Articulo,Long>{
    
    
}
