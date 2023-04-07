package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Quilt;
import java.util.List;

/**
 *
 * @author emers
 */
public interface QuiltService {

    public List<Quilt> getQuilts(boolean activos);

    public Quilt getQuilt(Quilt quilt);

    public void deleteQuilt(Quilt quilt);

    public void saveQuilt(Quilt quilt);

}
