package com.proyecto_final_g05.dao;

import com.proyecto_final_g05.domain.Color;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface ColorDao extends JpaRepository<Color,Long>{
    
}
