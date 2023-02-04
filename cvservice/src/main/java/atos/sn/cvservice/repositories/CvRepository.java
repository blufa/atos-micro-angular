package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.CvEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CvRepository extends MongoRepository<CvEntity, String> {
}
