package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.ReferenceEntity;

public interface ReferenceRepository extends MongoRepository<ReferenceEntity, String> {
}
