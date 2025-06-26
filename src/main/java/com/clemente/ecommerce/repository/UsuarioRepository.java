package com.clemente.ecommerce.repository;

import com.clemente.ecommerce.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    
    Optional<Usuarios> findByEmail(String email);
    List<Usuarios> findByAdmin(boolean admin);
    Optional<Usuarios> findByUsername(String username);
}
