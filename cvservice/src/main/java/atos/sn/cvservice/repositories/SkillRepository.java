package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.SkillEntity;

public interface SkillRepository extends MongoRepository<SkillEntity, String> {
}
