package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.LanguageEntity;

public interface LanguageRepository extends MongoRepository<LanguageEntity, String> {
}
