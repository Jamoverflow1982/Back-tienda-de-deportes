package com.clemente.ecommerce.repository;

import com.clemente.ecommerce.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {

    List<Pedidos> findByFecha(String fecha);
    List<Pedidos> findByEstado(String estado);
    List<Pedidos> findByidUsuario(Long idUsuario);

    void deleteByFecha(String fecha);
    void deleteByEstado(String estado);
}
