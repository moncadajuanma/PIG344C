package com.talentotech.energia.model;

import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.w3c.dom.Text;



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

    @Column(nullable = false, length = 500)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @CreationTimestamp
    @Column(name = "created_at ", nullable = false, updatable = false )
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "update_at ")
    private LocalDateTime updateAt;
    
    public User() {}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
