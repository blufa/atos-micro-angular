package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.ResumeDTO;
import atos.sn.cvservice.entities.ResumeEntity;

public interface ResumeService {
    ResumeDTO addResume(ResumeDTO candidateDTO);

    ResumeDTO editResume(ResumeDTO candidateDTO);

    List<ResumeEntity> getResumes();

    ResumeEntity getResume(String id);

    void deleteResume(String id);
}
