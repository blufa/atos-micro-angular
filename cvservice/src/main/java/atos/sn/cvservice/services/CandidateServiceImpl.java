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
    private CandidateRepository userRepository;

    @Autowired
    private CandidateMapper userMapper;

    @Override
    public CandidateDTO addCandidate(CandidateDTO userDTO) {
        CandidateEntity userEntity = userMapper.toEntity(userDTO);
        CandidateEntity addedCandidateEntity = userRepository.save(userEntity);
        return userMapper.toDto(addedCandidateEntity);
    }

    @Override
    public CandidateDTO editCandidate(CandidateDTO userDTO, String id) {
        // Check if resume exists before editing
        Optional<CandidateEntity> userEntity = userRepository.findById(id);

        if (userEntity.isPresent()) {
            CandidateEntity newCandidateEntity = userMapper.toEntity(userDTO);
            CandidateEntity savedCandidate = userRepository.save(newCandidateEntity);
            return userMapper.toDto(savedCandidate);
        }

        return new CandidateDTO();
    }

    @Override
    public List<CandidateEntity> getCandidates() {
        return userRepository.findAll();
    }

    @Override
    public CandidateEntity getCandidate(String id) {
        Optional<CandidateEntity> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }

        return new CandidateEntity();
    }

    @Override
    public void deleteCandidate(String id) {
        userRepository.deleteById(id);
    }
}
