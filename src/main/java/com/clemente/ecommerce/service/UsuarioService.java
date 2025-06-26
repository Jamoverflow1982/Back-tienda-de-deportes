package com.clemente.ecommerce.service;

import com.clemente.ecommerce.model.Usuarios;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuarios> listarUsuarios();
    Optional<Usuarios> obtenerUsuarioPorId(Long id);
    Optional<Usuarios> obtenerUsuarioPorEmail(String email);
    Optional<Usuarios> obtenerUsuarioPorUsername(String username);
    List<Usuarios> listarUsuariosPorAdmin(boolean admin);
    List<Usuarios> listarUsuariosPorUsername(String username);
    Usuarios guardarUsuario(Usuarios usuario);
    Usuarios actualizarUsuario(Long id, Usuarios usuario);
    void eliminarUsuario(Long id);
    void eliminarUsuarioPorEmail(String email);
    void eliminarUsuarioPorUsername(String username);
}
