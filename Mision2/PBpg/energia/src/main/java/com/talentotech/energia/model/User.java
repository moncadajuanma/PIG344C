package com.talentotech.energia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id // Id es primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id generado automaticamente y autoincrementa
    private Long id; // Tipo y nombre de variable
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
