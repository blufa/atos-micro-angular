package atos.sn.userservice.services;

import atos.sn.userservice.dto.LoginRequest;
import atos.sn.userservice.dto.LoginResponse;
import atos.sn.userservice.dto.RegisterRequest;
import atos.sn.userservice.dto.TokenDto;
import atos.sn.userservice.entities.RefreshTokenEntity;
import atos.sn.userservice.entities.UserEntity;
import atos.sn.userservice.jwt.JwtUtils;
import atos.sn.userservice.repositories.RefreshTokenRepository;
import atos.sn.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository _UserRepository;
    @Autowired
    private RefreshTokenRepository _refreshTokenRepository;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils _jwtUtils;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public LoginResponse login(LoginRequest creadentials) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creadentials.getEmail(), creadentials.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserEntity user = (UserEntity) authentication.getPrincipal();

        RefreshTokenEntity refreshToken = new RefreshTokenEntity();
        refreshToken.setOwner(user);
        this._refreshTokenRepository.save(refreshToken);
        String accessToken = this._jwtUtils.generateAccessToken(user);
        String refreshTokenString = this._jwtUtils.generateRefreshToken(user, refreshToken);

        return LoginResponse.fromEntity(user, accessToken, refreshTokenString);

        //return ResponseEntity.ok(new TokenDTO(user.getId(), accessToken, refreshTokenString));
    }

    @Override
    public Boolean logout(String creadentials) {
        return null;
    }

    @Override
    public LoginResponse register(RegisterRequest creadentials) {
        creadentials.setPassword(passwordEncoder.encode(creadentials.getPassword()));
        UserEntity newUser = this._UserRepository.save(RegisterRequest.toEntity(creadentials));

        RefreshTokenEntity refreshToken = new RefreshTokenEntity();
        refreshToken.setOwner(newUser);
        this._refreshTokenRepository.save(refreshToken);

        String accessToken = this._jwtUtils.generateAccessToken(newUser);
        String refreshTokenString = this._jwtUtils.generateRefreshToken(newUser, refreshToken);

        return LoginResponse.fromEntity(newUser, accessToken, refreshTokenString);
    }

    @Override
    public TokenDto refreshToken(TokenDto tokens) {
        return null;
    }

    @Override
    public Boolean existsEmail(String email) {
        return this._UserRepository.existsByEmail(email);
    }

}
