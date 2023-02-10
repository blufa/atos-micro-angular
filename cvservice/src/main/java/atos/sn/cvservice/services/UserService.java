package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.UserDTO;
import atos.sn.cvservice.entities.UserEntity;

public interface UserService {
    UserDTO addUser(UserDTO userDTO);

    UserDTO editUser(UserDTO userDTO, String id);

    List<UserEntity> getUsers();

    UserEntity getUser(String id);

    void deleteUser(String id);
}
