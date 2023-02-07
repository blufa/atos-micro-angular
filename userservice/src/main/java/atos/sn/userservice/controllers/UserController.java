package atos.sn.userservice.controllers;

import atos.sn.userservice.controllers.api.UserApi;
import atos.sn.userservice.dto.UserDto;
import atos.sn.userservice.entities.UserEntity;
import atos.sn.userservice.repositories.UserRepository;
import atos.sn.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController implements UserApi {
    @Autowired
    private UserService _service;
    @Autowired
    private UserRepository _userRepository;


    @Override
    public ResponseEntity<?> getAllUsers() {
        Map<String, Object> map;
        try {
            List<UserEntity> users = this._service.getAllUsers();
            if (users.isEmpty()) {  return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
            map = Map.of("status", 200,"data", users);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map = Map.of("status", 500, "data", null, "message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> getUser(String id) {

        Map<String, Object> map;
        try {
            UserDto user = this._service.getUser(id);
            map = Map.of("status", 200, "data", user);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map= Map.of("status", 500, "data", null, "message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> updateUser(UserDto user) {

        Map<String, Object> map;
        try {
            UserDto updatedUser = this._service.updateUser(user);
            map = Map.of("status", 200, "data", updatedUser, "message", "User updated successfully");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map = Map.of("status", 500, "data", null, "message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> deleteUser(String id) {
        Map<String, Object> map = new LinkedHashMap<>();
        try {
            this._service.deleteUser(id);
            map.put("status", 201);
            map.put("data", null);
            map.put("message", "User deleted successfully");
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map.put("status", 500);
            map.put("data", null);
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
