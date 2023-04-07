package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.QuiltDao;
import com.proyecto_final_g05.domain.Quilt;
import com.proyecto_final_g05.service.QuiltService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */
@Service
public class QuiltServiceImpl implements QuiltService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private QuiltDao quiltDao;
    
    @Override
    public List<Quilt> getQuilts(boolean activos) {
            var lista=(List<Quilt>) quiltDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;
        
    }

    @Override
    public Quilt getQuilt(Quilt quilt) {
        return quiltDao.findById(quilt.getIdQuilt()).orElse(null);
    }

    @Override
    public void deleteQuilt(Quilt quilt) {
        quiltDao.delete(quilt);
    }

    @Override
    public void saveQuilt(Quilt quilt) {
        quiltDao.save(quilt);
    }
}
