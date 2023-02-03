package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.SkillEntity;

public interface SkillRepository extends MongoRepository<SkillEntity, String> {
}
