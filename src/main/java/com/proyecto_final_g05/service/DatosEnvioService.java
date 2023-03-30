
package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.DatosEnvio;
import java.util.List;

public interface DatosEnvioService {
    public List<DatosEnvio> getDatosEnvios();
    public DatosEnvio getDatosEnvio(DatosEnvio datosEnvio);
    public void deleteDatosEnvio (DatosEnvio datosEnvio);
    public void saveDatosEnvio (DatosEnvio datosEnvio);

}
