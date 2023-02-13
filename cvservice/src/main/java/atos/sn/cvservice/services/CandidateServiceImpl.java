package atos.sn.cvservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.sn.cvservice.dto.CandiateDTO;
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
    public CandiateDTO addUser(CandiateDTO userDTO) {
        CandidateEntity userEntity = userMapper.toEntity(userDTO);
        CandidateEntity addedUserEntity = userRepository.save(userEntity);
        return userMapper.toDto(addedUserEntity);
    }

    @Override
    public CandiateDTO editUser(CandiateDTO userDTO, String id) {
        // Check if resume exists before editing
        Optional<CandidateEntity> userEntity = userRepository.findById(id);

        if (userEntity.isPresent()) {
            CandidateEntity newUserEntity = userMapper.toEntity(userDTO);
            CandidateEntity savedUser = userRepository.save(newUserEntity);
            return userMapper.toDto(savedUser);
        }

        return new CandiateDTO();
    }

    @Override
    public List<CandidateEntity> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public CandidateEntity getUser(String id) {
        Optional<CandidateEntity> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }

        return new CandidateEntity();
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
