package com.clemente.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")

public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String email;
    private String username;
    private String password;
    private String nombreCompleto = "Usuario";
    private String direccion = "Calle Falsa 123";
    private String ciudad = "Buenos Aires";
    private String provincia = "Buenos Aires";
    private String codigoPostal = "01000";
    private String pais = "Argentina";
    private String telefono = "011-0000-0000";
    private boolean admin = false;



    public Usuarios() {}
    public Usuarios(Long id, String email, String password, String username, boolean admin, String nombreCompleto, String direccion, String ciudad, String provincia, String codigoPostal, String pais, String telefono) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.admin = admin;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.telefono = telefono;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAdmin() {
        return admin;
    }
    
    public void setAdmin (boolean admin) {
        this.admin = admin;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
