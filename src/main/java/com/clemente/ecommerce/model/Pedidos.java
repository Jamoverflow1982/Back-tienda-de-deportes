package com.clemente.ecommerce.model;


import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido")

public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUsuario;
    private String fecha;
    private String fechaAct;
    private String estado;
    private List<Integer> articulos;

    public Pedidos() {}

    public Pedidos(Long id, Long idUsuario, String fecha, String fechaAct, String estado, List<Integer> articulos) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.fechaAct = fechaAct;
        this.estado = estado;
        this.articulos = articulos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getFechaAct() { return fechaAct; }
    public void setFechaAct(String fechaAct) { this.fechaAct = fechaAct; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public List<Integer> getArticulos() { return articulos; }
    public void setArticulos(List<Integer> articulos) { this.articulos = articulos; }
}