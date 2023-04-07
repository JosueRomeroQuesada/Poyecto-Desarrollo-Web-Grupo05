package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Hogar;
import java.util.List;

/**
 *
 * @author emers
 */
public interface HogarService {

    public List<Hogar> getHogars(boolean activos);

    public Hogar getHogar(Hogar hogar);

    public void deleteHogar(Hogar hogar);

    public void saveHogar(Hogar hogar);

}
