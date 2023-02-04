package atos.sn.cvservice.services;

import java.util.List;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.entities.CandidateEntity;

public interface CandidateService {
    CandidateDTO addCandidate(CandidateDTO candidateDTO);

    CandidateDTO editCandidate(CandidateDTO candidateDTO);

    List<CandidateEntity> getCandidates();

    CandidateEntity getCandidate(String id);

    void deleteCandidate(String id);
}
