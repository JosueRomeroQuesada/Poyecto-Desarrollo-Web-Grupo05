
package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.MetodoPagoDao;
import com.proyecto_final_g05.domain.MetodoPago;
import com.proyecto_final_g05.service.MetodoPagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoServiceImp implements MetodoPagoService{

    @Autowired
    private MetodoPagoDao metodoPagoDao;
    
    @Override
    public List<MetodoPago> getMetodoPagos() {
        return (List<MetodoPago>) metodoPagoDao.findAll();
    }

    @Override
    public MetodoPago getMetodoPago(MetodoPago metodoPago) {
        return metodoPagoDao.findById(metodoPago.getIdMetodo()).orElse(null);
    }

    @Override
    public void deleteMetodoPago(MetodoPago metodoPago) {
        metodoPagoDao.delete(metodoPago);
    }

    @Override
    public void saveMetodoPago(MetodoPago metodoPago) {
        metodoPagoDao.save(metodoPago);
    }

    
    
}
