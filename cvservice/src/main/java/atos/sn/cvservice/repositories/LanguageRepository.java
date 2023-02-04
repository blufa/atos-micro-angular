package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.LanguageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<LanguageEntity, String> {
}
