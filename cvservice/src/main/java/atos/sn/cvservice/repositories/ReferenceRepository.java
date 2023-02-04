package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.ReferenceEntity;

public interface ReferenceRepository extends MongoRepository<ReferenceEntity, String> {
}
