package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.HogarDao;
import com.proyecto_final_g05.domain.Hogar;
import com.proyecto_final_g05.service.HogarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */
@Service
public class HogarServiceImpl implements HogarService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private HogarDao hogarDao;
    
    @Override
    public List<Hogar> getHogars(boolean activos) {
            var lista=(List<Hogar>) hogarDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;
        
    }

    @Override
    public Hogar getHogar(Hogar hogar) {
        return hogarDao.findById(hogar.getIdHogar()).orElse(null);
    }

    @Override
    public void deleteHogar(Hogar hogar) {
        hogarDao.delete(hogar);
    }

    @Override
    public void saveHogar(Hogar hogar) {
        hogarDao.save(hogar);
    }
}
