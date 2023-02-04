package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.CandidateEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CandidateRepository  extends MongoRepository<CandidateEntity, String> {
}
