package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.ReferenceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReferenceRepository extends MongoRepository<ReferenceEntity, String> {
}
