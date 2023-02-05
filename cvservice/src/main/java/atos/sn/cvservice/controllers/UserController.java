package atos.sn.cvservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import atos.sn.cvservice.dto.UserDTO;
import atos.sn.cvservice.entities.UserEntity;
import atos.sn.cvservice.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService candidateService;

    @PostMapping("/users")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return candidateService.addUser(userDTO);
    }

    @PutMapping("/users/{id}")
    public UserDTO editUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
        return candidateService.editUser(userDTO, id);
    }

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        return candidateService.getUsers();
    }

    @GetMapping("/users/{id}")
    public UserEntity getUser(@PathVariable String id) {
        return candidateService.getUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable String id) {
        candidateService.deleteUser(id);
    }
}
