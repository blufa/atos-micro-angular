package atos.sn.cvservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import atos.sn.cvservice.entities.CertificateEntity;

public interface CertificateRepository extends MongoRepository<CertificateEntity, String> {
}
