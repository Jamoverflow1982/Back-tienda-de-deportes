package com.clemente.ecommerce.service;

import com.clemente.ecommerce.model.Usuarios;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuarios> listarUsuarios();
    Optional<Usuarios> obtenerUsuarioPorId(Long id);
    List<Usuarios> obtenerUsuarioPorEmail(String email);
    List<Usuarios> obtenerUsuarioPorUsername(String username);
    List<Usuarios> obtenerUsuarioPorAdmin(boolean admin);
    Usuarios guardarUsuario(Usuarios usuario);
    Usuarios actualizarUsuario(Long id, Usuarios usuario);
    void eliminarUsuario(Long id);
    void eliminarUsuarioPorEmail(String email);
    void eliminarUsuarioPorUsername(String username);
    void eliminarUsuarioPorAdmin(boolean admin);
}
