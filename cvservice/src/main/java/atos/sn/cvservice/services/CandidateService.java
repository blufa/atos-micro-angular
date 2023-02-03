package atos.sn.cvservice.services;

import sn.atos.cv.entites.CandidateEntity;

import java.util.List;

public interface CandidateService {
    CandidateEntity addCandidate(CandidateEntity candidate);
    CandidateEntity editCandidate(CandidateEntity candidate);
    List<CandidateEntity> getCandidates();
    CandidateEntity getCandidate(String id);
    void delete(String id);
}
