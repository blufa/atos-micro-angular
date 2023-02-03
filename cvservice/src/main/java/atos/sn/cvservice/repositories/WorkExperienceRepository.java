package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.WorkExperienceEntity;


public interface WorkExperienceRepository extends MongoRepository<WorkExperienceEntity, String> {
}
