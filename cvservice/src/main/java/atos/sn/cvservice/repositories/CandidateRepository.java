package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import atos.sn.cvservice.entities.CandidateEntity;

@Repository
public interface CandidateRepository extends MongoRepository<CandidateEntity, String> {
}
