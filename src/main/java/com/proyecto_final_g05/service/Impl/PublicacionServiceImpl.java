package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.PublicacionDao;
import com.proyecto_final_g05.domain.Publicacion;
import com.proyecto_final_g05.service.PublicacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */

@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionDao publicacionDao;

    @Override
    public List<Publicacion> getPublicaciones() {
        var lista = (List<Publicacion>) publicacionDao.findAll();        
        return lista;

    }

    @Override
    public Publicacion getPublicacion(Publicacion publicacion) {
        return publicacionDao.findById(publicacion.getIdPublicacion()).orElse(null);
    }

    @Override
    public void deletePublicacion(Publicacion publicacion) {
        publicacionDao.delete(publicacion);
    }

    @Override
    public void savePublicacion(Publicacion publicacion) {
        publicacionDao.save(publicacion);
    }

}
