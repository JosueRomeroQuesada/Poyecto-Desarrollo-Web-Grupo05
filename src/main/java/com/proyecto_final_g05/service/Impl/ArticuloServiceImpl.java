package com.proyecto_final_g05.service.Impl;


import com.proyecto_final_g05.dao.ArticuloDao;
import com.proyecto_final_g05.dao.CategoriaDao;
import com.proyecto_final_g05.domain.Articulo;
import com.proyecto_final_g05.service.ArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */

@Service
public class ArticuloServiceImpl implements ArticuloService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) {
            var lista=(List<Articulo>) articuloDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;       
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    public void deleteArticulo(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloDao.save(articulo);
    }
    
    
    
}
