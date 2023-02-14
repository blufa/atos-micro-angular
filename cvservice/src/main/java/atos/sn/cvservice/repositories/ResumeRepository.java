package atos.sn.cvservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import atos.sn.cvservice.entities.ResumeEntity;

public interface ResumeRepository extends MongoRepository<ResumeEntity, String> {
    List<ResumeEntity> findByUserId(String userId);
}
