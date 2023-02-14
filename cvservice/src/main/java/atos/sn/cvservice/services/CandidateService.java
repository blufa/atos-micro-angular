package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.entities.CandidateEntity;

public interface CandidateService {
    CandidateDTO addCandidate(CandidateDTO userDTO);

    CandidateDTO editCandidate(CandidateDTO userDTO, String id);

    List<CandidateEntity> getCandidates();

    CandidateEntity getCandidate(String id);

    void deleteCandidate(String id);
}
