package atos.sn.userservice.services;

import atos.sn.userservice.dto.*;
import atos.sn.userservice.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> getAllUsers();
    UserDto getUser(String id);
    UserDto updateUser(UserDto user);
    void deleteUser(String id);

}
