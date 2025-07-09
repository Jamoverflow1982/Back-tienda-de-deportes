package com.clemente.ecommerce.controller;

import com.clemente.ecommerce.model.Pedidos;
import com.clemente.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/pedidos")

public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedidos> obtenerTodosLosPedidos() {
        return pedidoService.obtenerTodosLosPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> obtenerPedidoPorId(@PathVariable Long id) {
        Optional<Pedidos> pedido = pedidoService.obtenerPedidoPorId(id);
        return pedido.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pedidos> guardarPedido(@RequestBody Pedidos pedido) {
        return ResponseEntity.ok(pedidoService.guardarPedido(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedidos> actualizarPedidoPorId(@PathVariable Long id, @RequestBody Pedidos pedido) {
        return ResponseEntity.ok(pedidoService.actualizarPedidoPorId(id, pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPedidoPorId(@PathVariable Long id) {
        pedidoService.eliminarPedidoPorId(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/idUsuario/{idUsuario}")
    public List<Pedidos> obtenerPedidosPorIdUsuario(@PathVariable Long idUsuario) {
        return pedidoService.obtenerPedidosPorIdUsuario(idUsuario);
    }

}