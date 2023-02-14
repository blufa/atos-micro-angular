package atos.sn.userservice.controllers;

import atos.sn.userservice.controllers.api.UserApi;
import atos.sn.userservice.dto.UserDto;
import atos.sn.userservice.entities.UserEntity;
import atos.sn.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
// @CrossOrigin(origins = "*")
public class UserController implements UserApi {
    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<?> getAllUsers() {
        Map<String, Object> map;
        try {
            List<UserEntity> users = this.userService.getAllUsers();
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            map = Map.of("status", 200, "data", users);
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
            UserDto user = this.userService.getUser(id);
            map = Map.of("status", 200, "data", user);
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            map = Map.of("status", 500, "data", null, "message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> updateUser(UserDto user) {

        Map<String, Object> map;
        try {
            UserDto updatedUser = this.userService.updateUser(user);
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
            this.userService.deleteUser(id);
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
