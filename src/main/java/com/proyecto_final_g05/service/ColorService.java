package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Color;
import java.util.List;

/**
 *
 * @author emers
 */
public interface ColorService {

    public List<Color> getColors(boolean activos);

    public Color getColor(Color color);

    public void deleteColor(Color color);

    public void saveColor(Color color);

}
