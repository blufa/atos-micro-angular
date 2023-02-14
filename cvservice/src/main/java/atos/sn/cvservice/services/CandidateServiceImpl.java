package atos.sn.cvservice.services;

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
    public CandidateDTO addCandidate(CandidateDTO candidateDTO) {
        CandidateEntity candidateEntity = candidateMapper.toEntity(candidateDTO);
        CandidateEntity addedCandidateEntity = candidateRepository.save(candidateEntity);
        return candidateMapper.toDto(addedCandidateEntity);
    }

    @Override
    public CandidateDTO editCandidate(CandidateDTO userDTO, String id) {
        // Check if resume exists before editing
        Optional<CandidateEntity> userEntity = candidateRepository.findById(id);

        if (userEntity.isPresent()) {
            CandidateEntity newCandidateEntity = candidateMapper.toEntity(userDTO);
            CandidateEntity savedCandidate = candidateRepository.save(newCandidateEntity);
            return candidateMapper.toDto(savedCandidate);
        }

        return new CandidateDTO();
    }

    @Override
    public List<CandidateEntity> getCandidates() {
        return candidateRepository.findAll();
    }

    @Override
    public CandidateEntity getCandidate(String id) {
        Optional<CandidateEntity> candidate = candidateRepository.findById(id);

        if (candidate.isPresent()) {
            return candidate.get();
        }

        return new CandidateEntity();
    }

    @Override
    public void deleteCandidate(String id) {
        candidateRepository.deleteById(id);
    }
}
