package com.proyecto_final_g05.service.Impl;

import com.proyecto_final_g05.dao.CartucheraDao;
import com.proyecto_final_g05.domain.Cartuchera;
import com.proyecto_final_g05.service.CartucheraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emers
 */
@Service
public class CartucheraServiceImpl implements CartucheraService{

    //Esto crea una unica copia de un objeto
    @Autowired
    private CartucheraDao cartucheraDao;
    
    @Override
    public List<Cartuchera> getCartucheras(boolean activos) {
            var lista=(List<Cartuchera>) cartucheraDao.findAll();
            if (activos) {
            lista.removeIf(e -> e.isActivo());
        }
            return lista;
        
    }

    @Override
    public Cartuchera getCartuchera(Cartuchera cartuchera) {
        return cartucheraDao.findById(cartuchera.getIdCartuchera()).orElse(null);
    }

    @Override
    public void deleteCartuchera(Cartuchera cartuchera) {
        cartucheraDao.delete(cartuchera);
    }

    @Override
    public void saveCartuchera(Cartuchera cartuchera) {
        cartucheraDao.save(cartuchera);
    }
}
