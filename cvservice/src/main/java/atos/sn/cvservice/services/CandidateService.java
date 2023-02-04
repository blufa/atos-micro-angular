package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.CandidateEntity;

import java.util.List;

public interface CandidateService {
    CandidateEntity addCandidate(CandidateEntity candidate);
    CandidateEntity editCandidate(CandidateEntity candidate);
    List<CandidateEntity> getCandidates();
    CandidateEntity getCandidate(String id);
    void deleteCandidate(String id);
}
