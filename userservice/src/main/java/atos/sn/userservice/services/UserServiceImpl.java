package atos.sn.userservice.services;

import atos.sn.userservice.dto.*;
import atos.sn.userservice.entities.UserEntity;
import atos.sn.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository _UserRepository;

    /*================================================================
    ====================== USER SERVICE IMPLEMENTATIONS ============
    ================================================================*/
    @Override
    public List<UserEntity> getAllUsers() {
        //return UserDto.fromEntities(this._repository.findAll());
        return this._UserRepository.findAll();
    }
    @Override
    public UserDto getUser(String id) {
        Optional<UserEntity> userEntity = this._UserRepository.findById(id);
        if(userEntity.isPresent()) {
            return UserDto.fromEntity(userEntity.get());
        }
        else {
            throw new UsernameNotFoundException("User with id -> " + id + " not found");
        }
    }
    @Override
    public UserDto updateUser(UserDto user) {
        return null;
    }
    @Override
    public void deleteUser(String id) {}
    public UserEntity findById(String id) {
        return this._UserRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("user id not found"));
    }
    @Override
    public UserEntity loadUserByUsername(String email) throws UsernameNotFoundException {
        return this._UserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User with email -> "+email+" not found"));
    }
}
