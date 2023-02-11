package atos.sn.cvservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import atos.sn.cvservice.dto.ResumeDTO;
import atos.sn.cvservice.entities.ResumeEntity;
import atos.sn.cvservice.services.ResumeService;

@RestController
@CrossOrigin(origins = "*")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @PostMapping("/resumes")
    public ResumeDTO addResume(@RequestBody ResumeDTO resumeDTO) {
        return resumeService.addResume(resumeDTO);
    }

    @PutMapping("/resumes/{id}")
    public ResumeDTO editResume(@PathVariable String id, @RequestBody ResumeDTO resumeDTO) {
        return resumeService.editResume(resumeDTO, id);
    }

    @GetMapping("/resumes")
    public List<ResumeEntity> getResumes() {
        return resumeService.getResumes();
    }

    @GetMapping("/resumes/{id}")
    public ResumeEntity getResume(@PathVariable String id) {
        return resumeService.getResume(id);
    }

    @DeleteMapping("/resumes/{id}")
    public void deleteResume(@PathVariable String id) {
        resumeService.deleteResume(id);
    }
}
