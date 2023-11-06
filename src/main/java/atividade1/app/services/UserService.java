package atividade1.app.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atividade1.app.models.User;
import atividade1.app.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        List<User> users = repository.findAll();
        return users;
    }

    public User findById(UUID id) {
        User user = repository.findById(id).get();
        return user;
    }

    public String createUser(User user) {
        repository.save(user);
        return "User has been created successfully";
    }

    public String updateUser(UUID id, User user) {
        User response = findById(id);

        response.setName(user.getName());
        response.setAddress(user.getAddress());
        response.setStartDate(user.getStartDate());
        response.setFinishDate(user.getFinishDate());
        repository.save(response);
        
        return "User has been updated successfully";
    }

    public String deleteUser(UUID id) {
        repository.deleteById(id);
        return "User has been deleted successfully";
    }
}
