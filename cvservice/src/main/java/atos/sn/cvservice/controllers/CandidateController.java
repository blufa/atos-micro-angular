package atos.sn.cvservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import atos.sn.cvservice.dto.CandidateDTO;
import atos.sn.cvservice.entities.CandidateEntity;
import atos.sn.cvservice.services.CandidateService;

@RestController
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/candidates")
    public CandidateDTO addCandidateEntity(@RequestBody CandidateDTO candidateDTO) {
        return candidateService.addCandidate(candidateDTO);
    }

    @PutMapping("/candidates/{id}")
    public CandidateDTO editCandidate(@PathVariable String id, @RequestBody CandidateDTO candidateDTO) {
        return candidateService.editCandidate(candidateDTO);
    }

    @GetMapping("/candidates")
    public List<CandidateEntity> getCandidates() {
        return candidateService.getCandidates();
    }

    @GetMapping("/candidates/{id}")
    public CandidateEntity getCandidate(@PathVariable String id) {
        return candidateService.getCandidate(id);
    }

    @DeleteMapping("/candidates/{id}")
    public void deleteCandidate(@PathVariable String id) {
        candidateService.deleteCandidate(id);
    }
}
