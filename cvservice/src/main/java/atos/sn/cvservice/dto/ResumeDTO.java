package atos.sn.cvservice.dto;

import java.util.List;

import atos.sn.cvservice.entities.CandidateEntity;
import atos.sn.cvservice.entities.models.AwardsHonors;
import atos.sn.cvservice.entities.models.Certificate;
import atos.sn.cvservice.entities.models.Education;
import atos.sn.cvservice.entities.models.Language;
import atos.sn.cvservice.entities.models.Reference;
import atos.sn.cvservice.entities.models.Skill;
import atos.sn.cvservice.entities.models.WorkExperience;

public class ResumeDTO {
    private String id;
    private String userId;
    private CandidateEntity candidate;
    private List<Education> education;
    private List<String> leisures;
    private List<Certificate> certifications;
    private List<Skill> skills;
    private List<Reference> references;
    private List<Language> languages;
    private List<WorkExperience> workExperiences;
    private List<AwardsHonors> awardsHonors;

    public ResumeDTO(String id, String userId, CandidateEntity candidate, List<Education> education,
            List<String> leisures,
            List<Certificate> certifications, List<Skill> skills, List<Reference> references, List<Language> languages,
            List<WorkExperience> workExperiences, List<AwardsHonors> awardsHonors) {
        this.id = id;
        this.userId = userId;
        this.candidate = candidate;
        this.education = education;
        this.leisures = leisures;
        this.certifications = certifications;
        this.skills = skills;
        this.references = references;
        this.languages = languages;
        this.workExperiences = workExperiences;
        this.awardsHonors = awardsHonors;
    }

    public ResumeDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CandidateEntity getCandidate() {
        return candidate;
    }

    public void setCandidate(CandidateEntity candidate) {
        this.candidate = candidate;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<String> getLeisures() {
        return leisures;
    }

    public void setLeisures(List<String> leisures) {
        this.leisures = leisures;
    }

    public List<Certificate> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certificate> certifications) {
        this.certifications = certifications;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<AwardsHonors> getAwardsHonors() {
        return awardsHonors;
    }

    public void setAwardsHonors(List<AwardsHonors> awardsHonors) {
        this.awardsHonors = awardsHonors;
    }
}
