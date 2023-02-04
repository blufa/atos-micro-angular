package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.TrainingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainingRepository extends MongoRepository<TrainingEntity, String> {
}
