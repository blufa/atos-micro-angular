package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.CertificateEntity;

public interface CertificateService {
    CertificateEntity addCertificate(CertificateEntity certificate);
    CertificateEntity editCertificate(CertificateEntity certificate);
    List<CertificateEntity> getCertificates();
    CertificateEntity getCertificate(String id);

    void deleteCertficate(String id);
}
