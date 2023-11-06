package atividade1.app.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atividade1.app.models.User;
import atividade1.app.services.UserService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @PutMapping(value = "/{id}")
    public String editUser(@PathVariable UUID id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable UUID user) {
        return service.deleteUser(user);
    }
}
