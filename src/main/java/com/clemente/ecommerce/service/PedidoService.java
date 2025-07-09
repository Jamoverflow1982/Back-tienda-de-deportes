package com.clemente.ecommerce.service;

import com.clemente.ecommerce.model.Pedidos;

import java.util.List;
import java.util.Optional;


public interface PedidoService {
    
    List<Pedidos> obtenerTodosLosPedidos();
    Optional<Pedidos> obtenerPedidoPorId(Long id);
    List<Pedidos> obtenerPedidosPorFecha(String fecha);
    List<Pedidos> obtenerPedidosPorEstado(String estado);
    List<Pedidos> obtenerPedidosPorPedidios(List<Pedidos> pedidos);
    List<Pedidos> obtenerPedidosPorIdUsuario(Long idUsuario);

    Pedidos guardarPedido(Pedidos pedido);
    Pedidos actualizarPedido(Pedidos pedido);
    Pedidos actualizarPedidoPorId(Long id, Pedidos pedido);

    void eliminarPedidoPorId(Long id);
    void eliminarPedidosPorFecha(String fecha);
    void eliminarPedidosPorEstado(String estado);
}
