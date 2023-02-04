package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.SkillEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<SkillEntity, String> {
}
