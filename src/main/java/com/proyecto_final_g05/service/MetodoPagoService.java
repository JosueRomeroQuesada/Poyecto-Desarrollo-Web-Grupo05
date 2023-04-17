package com.proyecto_final_g05.service;


import com.proyecto_final_g05.domain.MetodoPago;
import java.util.List;

/**
 *
 * @author emers
 */
public interface MetodoPagoService {
    
    //Obtiene la lista de registros de la tabla metodoPago
    //y lo coloca en una lista de objetos metodoPago
    public List<MetodoPago> getMetodoPagos();
    
    //Obtiene el registro de la tabla metodoPago
    //que tiene el idMetodoPago pasado por el objeto metodoPago.
    public MetodoPago getMetodoPago(MetodoPago metodoPago);
    
    //Elimina el registro de la tabla metodoPago
    //que tiene el idMetodoPago pasado por el objeto metodoPago
    public void deleteMetodoPago(MetodoPago metodoPago);  
    
    //Si el idMetodoPago pasado no existe o es nulo se crea un registro
    //nuevo en la tabla metodoPago, si el idMetodoPago existe, se actualiza
    //la informacion
    public void saveMetodoPago(MetodoPago metodoPago);
}
