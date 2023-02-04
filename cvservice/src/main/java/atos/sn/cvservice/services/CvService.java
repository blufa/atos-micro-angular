package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.CvEntity;

public interface CvService {
    CvEntity createCvEntity(CvEntity cv);
    CvEntity updateCvEntity(CvEntity cv);
    List<CvEntity> getAllCv();
    CvEntity getCv(String id);
    void deleteCv(String id);
}
