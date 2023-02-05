package atos.sn.cvservice.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.sn.cvservice.dto.UserDTO;
import atos.sn.cvservice.entities.UserEntity;
import atos.sn.cvservice.mappers.UserMapper;
import atos.sn.cvservice.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        UserEntity userEntity = userMapper.toEntity(userDTO);
        UserEntity addedUserEntity = userRepository.save(userEntity);
        return userMapper.toDto(addedUserEntity);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        // Check if resume exists before editing
        Optional<UserEntity> userEntity = userRepository.findById(userDTO.getId());

        if (userEntity.isPresent()) {
            UserEntity savedUser = userRepository.save(userEntity.get());
            return userMapper.toDto(savedUser);
        }

        return new UserDTO();
    }

    @Override
    public List<UserEntity> getUsers() {
        return Collections.<UserEntity>emptyList();
    }

    @Override
    public UserEntity getUser(String id) {
        Optional<UserEntity> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }

        return new UserEntity();
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
