package atos.sn.userservice.dto;

import atos.sn.userservice.entities.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class RegisterRequest {
    @NotBlank
    @Size(max = 60)
    private String firstName;
    @NotBlank
    @Size(max = 60)
    private String lastName;
    @NotBlank
    @Email
    @Size(max = 60)
    private String email;
    @NotBlank
    @Size(min = 6, max = 60)
    private String password;

    public static UserEntity toEntity(RegisterRequest user){
        return UserEntity
                .builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public static RegisterRequest fromEntity(UserEntity user){
        if(user == null){ return null; }
        return RegisterRequest
                .builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
