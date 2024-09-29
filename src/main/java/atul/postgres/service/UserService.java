package atul.postgres.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atul.postgres.model.User;
import atul.postgres.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // Save a user
    public User createUser(String name, String mail) {
        User user = new User(name, mail);
        return repo.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    //Get a user from userId
    public Optional<User> getUserById(Long id) {
        return repo.findById(id);
    }

    // Method to delete an existing user
    public User deleteById(Long id) {
        Optional<User> user = repo.findById(id);
        repo.deleteById(id);
        if (user.isPresent())
            return user.get();
        else
            return null;

    }

    // Method to update an existing user
    public User updateUser(Long id, String name, String email) {
        // Fetch the user from the database
        log.info("Inside updateUser Service");
        Optional<User> optionalUser = repo.findById(id);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            // Update the user's details
            user.setName(name);
            user.setEmail(email);
            // Save the updated user entity back to the database
            // This will update the record
            log.info("Inside updateUser Service the User is", user);

            return repo.saveAndFlush(user);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

}
