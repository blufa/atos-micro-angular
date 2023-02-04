package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.CvEntity;

import java.util.List;

public interface CvService {
    CvEntity createCvEntity(CvEntity cv);
    CvEntity updateCvEntity(CvEntity cv);
    List<CvEntity> getAllCv();
    CvEntity getCv(String id);
    void deleteCv(String id);
}
