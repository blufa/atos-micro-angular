package atos.sn.cvservice.services;

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
    public UserDTO editUser(UserDTO userDTO, String id) {
        // Check if resume exists before editing
        Optional<UserEntity> userEntity = userRepository.findById(id);

        if (userEntity.isPresent()) {
            UserEntity newUserEntity = userMapper.toEntity(userDTO);
            UserEntity savedUser = userRepository.save(newUserEntity);
            return userMapper.toDto(savedUser);
        }

        return new UserDTO();
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
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
