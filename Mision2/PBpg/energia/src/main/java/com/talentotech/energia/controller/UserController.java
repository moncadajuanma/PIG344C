package com.talentotech.energia.controller;

import java.util.List;
import com.talentotech.energia.model.User;
import com.talentotech.energia.repository.UserRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserRepository userRepository; // Instanciando userRepository

    public UserController(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }
    //Crear usuario
    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
    //Obtener todos los Usuarios
    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }
    //Obtener 1 usuario por ID
    @GetMapping("/{id}")
    public User findbyid(@PathVariable Long id) {
        return userRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User userDetails) {
        User user = userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }
}
