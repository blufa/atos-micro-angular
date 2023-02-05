package atos.sn.cvservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.sn.cvservice.dto.ResumeDTO;
import atos.sn.cvservice.entities.ResumeEntity;
import atos.sn.cvservice.mappers.ResumeMapper;
import atos.sn.cvservice.repositories.ResumeRepository;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public ResumeDTO addResume(ResumeDTO resumeDTO) {
        ResumeEntity resumeEntity = resumeMapper.toEntity(resumeDTO);
        ResumeEntity savedResume = resumeRepository.save(resumeEntity);
        return resumeMapper.toDto(savedResume);
    }

    @Override
    public ResumeDTO editResume(ResumeDTO resumeDTO) {
        // Check if resume exists before editing
        Optional<ResumeEntity> resumeEntity = resumeRepository.findById(resumeDTO.getId());

        if (resumeEntity.isPresent()) {
            ResumeEntity savedResume = resumeRepository.save(resumeEntity.get());
            return resumeMapper.toDto(savedResume);
        }

        return new ResumeDTO(); // return null if the resume does not exist
    }

    @Override
    public List<ResumeEntity> getResumes() {
        return resumeRepository.findAll();
    }

    @Override
    public ResumeEntity getResume(String id) {
        Optional<ResumeEntity> resumeEntity = resumeRepository.findById(id);

        if (resumeEntity.isPresent()) {
            return resumeEntity.get();
        }

        return new ResumeEntity();
    }

    @Override
    public void deleteResume(String id) {
        resumeRepository.deleteById(id);
    }

}
