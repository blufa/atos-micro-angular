package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.UserDTO;
import atos.sn.cvservice.entities.UserEntity;

public interface UserService {
    UserDTO addUser(UserDTO candidateDTO);

    UserDTO editUser(UserDTO candidateDTO);

    List<UserEntity> getUsers();

    UserEntity getUser(String id);

    void deleteUser(String id);
}
