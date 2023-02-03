package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.atos.cv.entites.CertificateEntity;

public interface CertificateRepository extends MongoRepository<CertificateEntity, String> {
}
