package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Monedero;
import java.util.List;

/**
 *
 * @author emers
 */
public interface MonederoService {
    
    public List<Monedero> getMonederos(boolean activos);
    

    public Monedero getMonedero(Monedero monedero);
    

    public void deleteMonedero(Monedero monedero);  
    

    public void saveMonedero(Monedero monedero);
    
}
