package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Cartuchera;
import java.util.List;

/**
 *
 * @author emers
 */
public interface CartucheraService {

    public List<Cartuchera> getCartucheras(boolean activos);

    public Cartuchera getCartuchera(Cartuchera cartuchera);

    public void deleteCartuchera(Cartuchera cartuchera);

    public void saveCartuchera(Cartuchera cartuchera);

}
