package atos.sn.cvservice.services;

import sn.atos.cv.entites.CertificateEntity;

import java.util.List;

public interface CertificateService {
    CertificateEntity addCertificate(CertificateEntity certificate);
    CertificateEntity editCertificate(CertificateEntity certificate);
    List<CertificateEntity> getCertificates();
    CertificateEntity getCertificate(String id);

    void delete(String id);
}
