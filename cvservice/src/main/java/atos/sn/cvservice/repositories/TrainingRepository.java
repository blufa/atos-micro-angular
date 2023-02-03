package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.TrainingEntity;

public interface TrainingRepository extends MongoRepository<TrainingEntity, String> {
}
