package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.CvEntity;

public interface CvRepository extends MongoRepository<CvEntity, String> {
}
