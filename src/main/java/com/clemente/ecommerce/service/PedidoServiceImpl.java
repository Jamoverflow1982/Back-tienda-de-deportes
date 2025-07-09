package com.clemente.ecommerce.service;

import com.clemente.ecommerce.model.Pedidos;
import com.clemente.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedidos> obtenerTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public List<Pedidos> obtenerPedidosPorPedidios(List<Pedidos> pedidos) {
        return pedidoRepository.saveAll(pedidos);
    }

    @Override
    public Optional<Pedidos> obtenerPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public List<Pedidos> obtenerPedidosPorFecha(String fecha) {
        return pedidoRepository.findByFecha(fecha);
    }

    @Override
    public List<Pedidos> obtenerPedidosPorEstado(String estado) {
        return pedidoRepository.findByEstado(estado);
    }

    @Override
    public void eliminarPedidosPorFecha(String fecha) {
        pedidoRepository.deleteByFecha(fecha);
    }

    @Override
    public void eliminarPedidosPorEstado(String estado) {
        pedidoRepository.deleteByEstado(estado);
    }

    @Override
    public Pedidos guardarPedido(Pedidos pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedidos actualizarPedido(Pedidos pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedidos actualizarPedidoPorId(Long id, Pedidos pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void eliminarPedidoPorId(Long id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public List<Pedidos> obtenerPedidosPorIdUsuario(Long idUsuario) {
        return pedidoRepository.findByidUsuario(idUsuario);
    }
}
