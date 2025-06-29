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
    private boolean admin = false;



    public Usuarios() {}
    public Usuarios(Long id, String email, String password, String username, boolean admin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.admin = admin;
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
}
