package com.clemente.ecommerce.repository;

import com.clemente.ecommerce.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    
    List<Usuarios> findByEmail(String email);
    List<Usuarios> findByUsername(String username);
    void deleteByEmail(String email);
    void deleteByUsername(String username);
}
