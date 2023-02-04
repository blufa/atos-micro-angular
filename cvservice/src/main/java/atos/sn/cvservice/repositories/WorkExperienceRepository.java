package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.WorkExperienceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WorkExperienceRepository extends MongoRepository<WorkExperienceEntity, String> {
}
