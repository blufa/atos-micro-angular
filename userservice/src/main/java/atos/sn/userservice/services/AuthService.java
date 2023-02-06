package atos.sn.userservice.services;

import atos.sn.userservice.dto.LoginRequest;
import atos.sn.userservice.dto.LoginResponse;
import atos.sn.userservice.dto.TokenDto;
import atos.sn.userservice.dto.RegisterRequest;

public interface AuthService {
    LoginResponse login(LoginRequest creadentials);
    Boolean logout(String creadentials);
    LoginResponse register(RegisterRequest creadentials);
    TokenDto refreshToken(TokenDto tokens);
    Boolean existsEmail(String email);
}
