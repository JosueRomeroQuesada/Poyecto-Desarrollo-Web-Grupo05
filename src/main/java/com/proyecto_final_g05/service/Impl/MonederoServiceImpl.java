package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.domain.Monedero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_final_g05.dao.MonederoDao;
import com.proyecto_final_g05.service.MonederoService;

/**
 *
 * @author emers
 */
@Service
public class MonederoServiceImpl implements MonederoService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private MonederoDao monederoDao;
    
    @Override
    public List<Monedero> getMonederos(boolean activos) {
            var lista=(List<Monedero>) monederoDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;
        
    }

    @Override
    public Monedero getMonedero(Monedero monedero) {
        return monederoDao.findById(monedero.getIdMonedero()).orElse(null);
    }

    @Override
    public void deleteMonedero(Monedero monedero) {
        monederoDao.delete(monedero);
    }

    @Override
    public void saveMonedero(Monedero monedero) {
        monederoDao.save(monedero);
    }
}
