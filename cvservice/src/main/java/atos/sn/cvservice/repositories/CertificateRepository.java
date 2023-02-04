package atos.sn.cvservice.repositories;

import atos.sn.cvservice.entites.CertificateEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CertificateRepository extends MongoRepository<CertificateEntity, String> {
}
