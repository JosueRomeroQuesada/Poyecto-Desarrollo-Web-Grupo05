package com.proyecto_final_g05.dao;

import com.proyecto_final_g05.domain.Monedero;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface MonederoDao extends JpaRepository<Monedero,Long>{
    
}
