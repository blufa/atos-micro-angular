package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.CertificateEntity;

import java.util.List;

public interface CertificateService {
    CertificateEntity addCertificate(CertificateEntity certificate);
    CertificateEntity editCertificate(CertificateEntity certificate);
    List<CertificateEntity> getCertificates();
    CertificateEntity getCertificate(String id);

    void deleteCertficate(String id);
}
