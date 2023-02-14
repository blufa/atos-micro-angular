package atos.sn.cvservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.dto.ResumeDTO;
import atos.sn.cvservice.entities.CandidateEntity;
import atos.sn.cvservice.entities.ResumeEntity;
import atos.sn.cvservice.mappers.CandidateMapper;
import atos.sn.cvservice.mappers.ResumeMapper;
import atos.sn.cvservice.repositories.ResumeRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;

    @Autowired
    private ResumeMapper resumeMapper;

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private CandidateMapper candidateMapper;

    @Override
    public ResumeDTO addResume(ResumeDTO resumeDTO) {
        // Create new Candidate
        CandidateDTO candidateDto = candidateService.addCandidate(candidateMapper.toDto(resumeDTO.getCandidate()));
        CandidateEntity candidateEntity = candidateMapper.toEntity(candidateDto);

        // Set candidate in Resume
        resumeDTO.setCandidate(candidateEntity);

        // Create new Resume
        ResumeEntity resumeEntity = resumeMapper.toEntity(resumeDTO);
        ResumeEntity savedResume = resumeRepository.save(resumeEntity);
        return resumeMapper.toDto(savedResume);
    }

    @Override
    public ResumeDTO editResume(ResumeDTO resumeDTO, String id) {
        // Check if resume exists before editing
        Optional<ResumeEntity> resumeEntity = resumeRepository.findById(id);

        if (resumeEntity.isPresent()) {
            // Edit candidate
            CandidateDTO candidateDto = candidateService.editCandidate(candidateMapper.toDto(resumeDTO.getCandidate()),
                    resumeDTO.getCandidate().getId());
            CandidateEntity candidateEntity = candidateMapper.toEntity(candidateDto);

            // Set candidate in Resume
            resumeDTO.setCandidate(candidateEntity);

            // Edit Resume
            ResumeEntity newResumeEntity = resumeMapper.toEntity(resumeDTO);
            ResumeEntity savedResume = resumeRepository.save(newResumeEntity);
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
        try {
            // Delete Candidate
            ResumeEntity resumeEntity = getResume(id);
            candidateService.deleteCandidate(resumeEntity.getCandidate().getId());

            // Delete Resume
            resumeRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ResumeEntity> getUserResume(String id) {
        return resumeRepository.findByUserId(id);
    }

}
