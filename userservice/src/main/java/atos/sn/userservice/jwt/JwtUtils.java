package atos.sn.userservice.jwt;

import atos.sn.userservice.entities.RefreshTokenEntity;
import atos.sn.userservice.entities.UserEntity;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
public class JwtUtils {
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    static final String issuer = "GesCV";
    private long accessTokenExpirationMinutes;
    private long refreshTokenExpirationDays;
    private Algorithm accessTokenAlgorithm;
    private Algorithm refreshTokenAlgorithm;
    private JWTVerifier accessTokenVerifier;
    private JWTVerifier refreshTokenVerifier;

    public JwtUtils(
            @Value("${jwt.accessTokenSecret}") String accessTokenSecret,
            @Value("${jwt.refreshTokenSecret}") String refreshTokenSecret,
            @Value("${jwt.accessTokenExpirationMinutes}") int accessTokenExpirationMinutes,
            @Value("${jwt.refreshTokenExpirationDays}") int refreshTokenExpirationDays
    ) {
        this.accessTokenExpirationMinutes = (long) accessTokenExpirationMinutes * 60 * 1000;
        this.refreshTokenExpirationDays = (long) refreshTokenExpirationDays * 24 * 60 * 60 * 1000;

        accessTokenAlgorithm = Algorithm.HMAC512(accessTokenSecret);
        refreshTokenAlgorithm = Algorithm.HMAC512(refreshTokenSecret);
        accessTokenVerifier = JWT.require(accessTokenAlgorithm).withIssuer(issuer).build();
        refreshTokenVerifier = JWT.require(refreshTokenAlgorithm).withIssuer(issuer).build();
    }
    public String generateAccessToken(UserEntity user) {
        return JWT.create()
                .withIssuer(issuer)
                .withSubject(user.getId())
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(new Date().getTime() + this.accessTokenExpirationMinutes))
                .sign(this.accessTokenAlgorithm);
    }
    public String generateRefreshToken(UserEntity user, RefreshTokenEntity refreshToken) {
        return JWT.create()
                .withIssuer(issuer)
                .withSubject(user.getId())
                .withClaim("tokenId", refreshToken.getId())
                .withIssuedAt(new Date())
                .withExpiresAt(new Date((new Date()).getTime() + this.refreshTokenExpirationDays))
                .sign(refreshTokenAlgorithm);
    }
    private Optional<DecodedJWT> decodeAccessToken(String token) {
        try {
            return Optional.of(accessTokenVerifier.verify(token));
        } catch (JWTVerificationException e) {
            LOG.error("invalid access token", e);
        }
        return Optional.empty();
    }
    private Optional<DecodedJWT> decodeRefreshToken(String token) {
        try {
            return Optional.of(refreshTokenVerifier.verify(token));
        } catch (JWTVerificationException e) {
            LOG.error("invalid refresh token", e);
        }
        return Optional.empty();
    }
    public boolean validateAccessToken(String token) { return decodeAccessToken(token).isPresent(); }
    public boolean validateRefreshToken(String token) { return decodeRefreshToken(token).isPresent(); }
    public String getUserIdFromAccessToken(String token) {
        Optional<DecodedJWT> accessToken = decodeAccessToken(token);
        if (accessToken.isPresent()){
            return accessToken.get().getSubject();
        }
        return "";
    }
    public String getUserIdFromRefreshToken(String token) {
        Optional<DecodedJWT> refreshToken = decodeRefreshToken(token);
        if (refreshToken.isPresent()){
            return refreshToken.get().getSubject();
        }
        return "";
    }
    public String getTokenIdFromRefreshToken(String token) {
        Optional<DecodedJWT> refreshToken = decodeRefreshToken(token);
        if (refreshToken.isPresent()){
            return refreshToken.get().getClaim("tokenId").asString();
        }
        return "";
    }
}
