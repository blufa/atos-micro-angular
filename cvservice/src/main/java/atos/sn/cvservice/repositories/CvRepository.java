package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.CvEntity;

public interface CvRepository extends MongoRepository<CvEntity, String> {
}
