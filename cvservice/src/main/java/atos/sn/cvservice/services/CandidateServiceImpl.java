package atos.sn.cvservice.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.entities.CandidateEntity;
import atos.sn.cvservice.mappers.CandidateMapper;
import atos.sn.cvservice.repositories.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CandidateMapper candidateMapper;

    @Override
    public CandidateDTO addCandidate(CandidateDTO candidate) {
        CandidateEntity candidateEntity = candidateMapper.toEntity(candidate);
        CandidateEntity addedCandidateEntity = candidateRepository.save(candidateEntity);
        return candidateMapper.toDto(addedCandidateEntity);
    }

    @Override
    public CandidateDTO editCandidate(CandidateDTO candidate) {
        CandidateEntity candidateEntity = candidateMapper.toEntity(candidate);
        CandidateEntity editedCandidateEntity = candidateRepository.save(candidateEntity);
        return candidateMapper.toDto(editedCandidateEntity);
    }

    @Override
    public List<CandidateEntity> getCandidates() {
        return Collections.<CandidateEntity>emptyList();
    }

    @Override
    public CandidateEntity getCandidate(String id) {
        Optional<CandidateEntity> candidate = candidateRepository.findById(id);

        if (candidate.isPresent()) {
            return candidate.get();
        }

        return null;
    }

    @Override
    public void deleteCandidate(String id) {
        candidateRepository.deleteById(id);
    }
}
