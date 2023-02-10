package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import atos.sn.cvservice.entities.ResumeEntity;

public interface ResumeRepository extends MongoRepository<ResumeEntity, String> {
    
}
