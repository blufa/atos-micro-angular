package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.WorkExperienceEntity;


public interface WorkExperienceRepository extends MongoRepository<WorkExperienceEntity, String> {
}
