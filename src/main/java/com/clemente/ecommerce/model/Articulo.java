package com.clemente.ecommerce.model;

import jakarta.persistence.*;

// Indica que esta clase es una entidad JPA
@Entity
@Table(name = "articulo") // Mapea a la tabla "articulo"
public class Articulo {

    @Id // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;

    private String nombre;
    private Double precio;
    private String descripcion;
    private String imagen;
    private int cantidad;
    private String categoria;
    private boolean disponible;

    // Relación Muchos a Uno: Muchos Articulos pueden pertenecer a un solo Pedido
    // @ManyToOne indica que múltiples instancias de Articulo están asociadas con una instancia de Pedido.
    // @JoinColumn especifica la columna de clave foránea en la tabla 'articulos' que se unirá a la clave primaria de 'pedidos'.
    // El nombre de la columna 'pedido_id' es una convención común.
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedidos pedido;

    public Articulo() {}

    public Articulo(Long id, String nombre, Double precio, String descripcion, String imagen, int cantidad, String categoria, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // Relación con la tabla "pedidos" Getters y Setters
    public Pedidos getPedido() { return pedido; }
    public void setPedido(Pedidos pedido) { this.pedido = pedido; }
}
