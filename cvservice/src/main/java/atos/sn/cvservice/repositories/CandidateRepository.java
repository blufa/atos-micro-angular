package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.CandidateEntity;

public interface CandidateRepository  extends MongoRepository<CandidateEntity, String> {
}
