package com.clemente.ecommerce.service;

import com.clemente.ecommerce.model.Usuarios;
import com.clemente.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuarios> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuarios> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuarios actualizarUsuario(Long id, Usuarios usuario) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Optional<Usuarios> obtenerUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
    @Override
    public Optional<Usuarios> obtenerUsuarioPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }
    @Override
    public List<Usuarios> listarUsuariosPorAdmin(boolean admin) {
        return usuarioRepository.findByAdmin(admin);
    }
    @Override
    public List<Usuarios> listarUsuariosPorUsername(String username) {
        return usuarioRepository.findByUsername(username).stream().toList();
    }
    @Override
    public void eliminarUsuarioPorEmail(String email) {
        usuarioRepository.findByEmail(email).ifPresent(usuario -> usuarioRepository.delete(usuario));
    }
    @Override
    public void eliminarUsuarioPorUsername(String username) {
        usuarioRepository.findByUsername(username).ifPresent(usuario -> usuarioRepository.delete(usuario));
    }

}
