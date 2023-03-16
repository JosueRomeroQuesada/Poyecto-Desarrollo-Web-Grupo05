
package com.proyecto_final_g05.service;

import com.proyecto_final_g05.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    public List<Usuario> getUsuarios();
    public Usuario getUsuario(Usuario usuario);
    public void deleteUsuario (Usuario usuario);
    public void saveUsuario (Usuario usuario);

}
