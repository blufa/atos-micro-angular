package atos.sn.userservice.repositories;

import atos.sn.userservice.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    public Optional<UserEntity> findByEmail(String email);
    public boolean existsByEmail(String email);
}
