package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.TrainingEntity;

public interface TrainingRepository extends MongoRepository<TrainingEntity, String> {
}
