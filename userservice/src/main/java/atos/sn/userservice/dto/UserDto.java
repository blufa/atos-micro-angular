package atos.sn.userservice.dto;

import atos.sn.userservice.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDto {
    private String id;
    @NotBlank
    @Size(max = 60)
    private String firstName;
    @NotBlank
    @Size(max = 60)
    private String lastName;

    public UserEntity toEntity(UserDto userDto) {
        return null;
        //return UserEntity.builder().setFirstName(userDto.getFirstName()).setLastName(userDto.getLastName()).build();
    }

    public static UserDto fromEntity(UserEntity user) {
        if(user == null){
            return null;
        }
        return UserDto
                .builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    public static List<UserDto> fromEntities(List<UserEntity> entities) {
        if(entities.isEmpty()) {
            return null;
        }
        return entities.stream().map(UserDto::fromEntity).collect(Collectors.toList());
    }

}
