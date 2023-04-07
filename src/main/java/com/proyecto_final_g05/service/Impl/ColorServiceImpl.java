package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.ColorDao;
import com.proyecto_final_g05.domain.Color;
import com.proyecto_final_g05.service.ColorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */
@Service
public class ColorServiceImpl implements ColorService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private ColorDao colorDao;
    
    @Override
    public List<Color> getColors(boolean activos) {
            var lista=(List<Color>) colorDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;
        
    }

    @Override
    public Color getColor(Color color) {
        return colorDao.findById(color.getIdColor()).orElse(null);
    }

    @Override
    public void deleteColor(Color color) {
        colorDao.delete(color);
    }

    @Override
    public void saveColor(Color color) {
        colorDao.save(color);
    }
}
