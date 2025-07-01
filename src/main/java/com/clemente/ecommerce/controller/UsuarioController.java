package com.clemente.ecommerce.controller;

import com.clemente.ecommerce.service.UsuarioService;
import com.clemente.ecommerce.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/usuarios") // Ruta base para los usuarios

public class UsuarioController {
    
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuarios> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
        for (Usuarios existingUser : usuarioService.listarUsuarios()) {
            if (existingUser.getEmail().equals(usuario.getEmail())) {
                throw new IllegalArgumentException("Ya existe un usuario con el email proporcionado: " + usuario.getEmail());
            }
        }
        return usuarioService.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> actualizarUsuario(@PathVariable Long id, @RequestBody Usuarios usuario) {
        if (usuarioService.obtenerUsuarioPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarioService.actualizarUsuario(id, usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        if (usuarioService.obtenerUsuarioPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/email/{email}")
    public ResponseEntity<List<Usuarios>> obtenerUsuarioPorEmail(@PathVariable String email) {
        List<Usuarios> usuarios = usuarioService.obtenerUsuarioPorEmail(email);
        if (usuarios.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<List<Usuarios>> obtenerUsuarioPorUsername(@PathVariable String username) {
        List<Usuarios> usuarios = usuarioService.obtenerUsuarioPorUsername(username);
        if (usuarios.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/admin/{admin}")
    public ResponseEntity<List<Usuarios>> obtenerUsuarioPorAdmin(@PathVariable boolean admin) {
        List<Usuarios> usuarios = usuarioService.obtenerUsuarioPorAdmin(admin);
        if(usuarios.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @DeleteMapping("/email/{email}")
    public ResponseEntity<Void> eliminarUsuarioPorEmail(@PathVariable String email) {
        if (usuarioService.obtenerUsuarioPorEmail(email).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.eliminarUsuarioPorEmail(email);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/username/{username}")
    public ResponseEntity<Void> eliminarUsuarioPorUsername(@PathVariable String username) {
        if (usuarioService.obtenerUsuarioPorUsername(username).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.eliminarUsuarioPorUsername(username);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/admin/{admin}")
    public ResponseEntity<Void> eliminarUsuarioPorUsername(@PathVariable boolean admin) {
        if (usuarioService.obtenerUsuarioPorAdmin(admin).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.eliminarUsuarioPorAdmin(admin);
        return ResponseEntity.noContent().build();
    }
}
