package atul.postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atul.postgres.model.User;
import atul.postgres.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestParam String name, @RequestParam String email) {       
        log.info("Inside the create user Controller");
        return service.createUser(name, email);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        log.info("Inside the List all user Controller");
        return service.getAllUsers();
    }

    @GetMapping
    public User getUserById(@RequestParam Long id) {
        log.info("Inside Get getUserById Controller");
        return service.getUserById(id).get();
    }

    @PutMapping
    public User updateUser(Long id, String name, String email) {
        log.info("Inside Get updateUser Controller");
        return service.updateUser(id, name, email);
    }

    @DeleteMapping
    public User deleteById(Long id) {
        log.info("Inside Get deleteUser Controller");
        return service.deleteById(id);
    }


}
