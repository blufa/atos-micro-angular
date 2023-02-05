package atos.sn.cvservice.mappers;

import org.mapstruct.Mapper;

import atos.sn.cvservice.dto.UserDTO;
import atos.sn.cvservice.entities.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(UserDTO userDTO);
    UserDTO toDto(UserEntity userEntity);
}
