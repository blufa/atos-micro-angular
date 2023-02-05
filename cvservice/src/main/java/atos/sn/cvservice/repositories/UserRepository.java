package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import atos.sn.cvservice.entities.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}
