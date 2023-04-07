package com.proyecto_final_g05.dao;

import com.proyecto_final_g05.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emers
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
