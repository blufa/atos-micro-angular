package atos.sn.cvservice.services;

import sn.atos.cv.entites.CvEntity;

import java.util.List;

public interface CvService {
    CvEntity createCvEntity(CvEntity cv);
    CvEntity updateCvEntity(CvEntity cv);
    List<CvEntity> getAllCv();
    CvEntity getCv(String id);
    void delete(String id);
}
