package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import atos.sn.cvservice.entities.ResumeEntity;

@Repository
public interface ResumeRepository extends MongoRepository<ResumeEntity, String> {
    
}
