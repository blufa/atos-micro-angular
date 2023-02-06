package atos.sn.userservice.controllers;

import atos.sn.userservice.controllers.api.AuthApi;
import atos.sn.userservice.dto.*;
import atos.sn.userservice.services.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class AuthController implements AuthApi {
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    private final AuthService _service;

    public AuthController(AuthService _service) {
        this._service = _service;
    }
    @Override
    public ResponseEntity<?> login(LoginRequest credentiels) {
        return null;
    }

    @Override
    public ResponseEntity<?> register(RegisterRequest credentials) {
        LOG.info("firstName: {}, lastName: {}, email: {}, password: {}", credentials.getFirstName(), credentials.getLastName(), credentials.getEmail(), credentials.getPassword());
        Map<String, Object> map = new LinkedHashMap<>();
        try {
            if(this._service.existsEmail(credentials.getEmail())) {
                map.put("status", 409);
                map.put("data", null);
                map.put("message", "Email "+credentials.getEmail()+" already exists");
                return new ResponseEntity<>(map, HttpStatus.CONFLICT);
            }
            LoginResponse userLoggedIn = this._service.register(credentials);
            map.put("status", 201);
            map.put("data", userLoggedIn);
            map.put("message", "Registration successfully");
            return new ResponseEntity<>(map, HttpStatus.CREATED);
        } catch (Exception e) {
            map.put("status", 500);
            map.put("data", null);
            map.put("message", e);
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<?> logout(TokenDto token) {
        return null;
    }

    @Override
    public ResponseEntity<?> refreshToken(TokenDto token) {
        return null;
    }
}
