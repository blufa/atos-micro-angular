package atos.sn.userservice.controllers.api;

import atos.sn.userservice.dto.UserDto;
import atos.sn.userservice.links.UserLinks;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface UserApi {
    @GetMapping(value = UserLinks.GET_ALL, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> getAllUsers();
    @GetMapping(value = UserLinks.GET_ONE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> getUser(String id);
    @PutMapping(value = UserLinks.UPDATE_USER, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> updateUser(@Valid @RequestBody UserDto user);
    @DeleteMapping(value = UserLinks.DELETE_USER, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> deleteUser(@PathVariable("id") String id);

}
