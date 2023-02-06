package atos.sn.userservice.dto;

import atos.sn.userservice.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class LoginResponse {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String accessToken;
    private String refreshToken;

    public static LoginResponse fromEntity(UserEntity entity, String access_token, String refresh_token) {
        if (entity == null) { return null; }
        return LoginResponse
                .builder()
                .userId(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .accessToken(access_token)
                .refreshToken(refresh_token)
                .build();
    }

}
