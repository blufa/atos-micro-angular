package atos.sn.userservice.controllers.api;

import atos.sn.userservice.dto.LoginRequest;
import atos.sn.userservice.dto.TokenDto;
import atos.sn.userservice.dto.RegisterRequest;
import atos.sn.userservice.links.AuthLinks;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface AuthApi {
    @PostMapping(value = AuthLinks.AUTH_LOGIN, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest credentiels);
    @PostMapping(value = AuthLinks.AUTH_REGISTER, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest credentials);
    @PostMapping(value = AuthLinks.AUTH_LOGOUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> logout(@RequestBody TokenDto token);
    @PostMapping(value = AuthLinks.AUTH_REFRESH_TOKEN, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> refreshToken(@RequestBody TokenDto token);

}
