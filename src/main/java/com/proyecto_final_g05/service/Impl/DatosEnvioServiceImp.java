
package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.DatosEnvioDao;
import com.proyecto_final_g05.domain.DatosEnvio;
import com.proyecto_final_g05.service.DatosEnvioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosEnvioServiceImp implements DatosEnvioService{

    @Autowired
    private DatosEnvioDao datosEnvioDao;
    
    @Override
    public List<DatosEnvio> getDatosEnvios() {
        return (List<DatosEnvio>) datosEnvioDao.findAll();
    }

    @Override
    public DatosEnvio getDatosEnvio(DatosEnvio datosEnvio) {
        return datosEnvioDao.findById(datosEnvio.getIdDatos()).orElse(null);
    }

    @Override
    public void deleteDatosEnvio(DatosEnvio datosEnvio) {
        datosEnvioDao.delete(datosEnvio);
    }

    @Override
    public void saveDatosEnvio(DatosEnvio datosEnvio) {
        datosEnvioDao.save(datosEnvio);
    }
    
}
