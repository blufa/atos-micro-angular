package atos.sn.cvservice.dto;

import java.util.List;

import atos.sn.cvservice.entities.UserEntity;
import atos.sn.cvservice.entities.models.AwardsHonors;
import atos.sn.cvservice.entities.models.Certificate;
import atos.sn.cvservice.entities.models.Language;
import atos.sn.cvservice.entities.models.Reference;
import atos.sn.cvservice.entities.models.Skill;
import atos.sn.cvservice.entities.models.WorkExperience;

public class ResumeDTO {
    private String id;
    private UserEntity candidate;
    private List<String> leisures;
    private List<Certificate> certications;
    private List<Skill> skills;
    private List<Reference> references;
    private List<Language> languages;
    private List<WorkExperience> experiences;
    private List<AwardsHonors> awardsHonors;

    public ResumeDTO(String id, UserEntity candidate, List<String> leisures, List<Certificate> certications,
            List<Skill> skills, List<Reference> references, List<Language> languages, List<WorkExperience> experiences,
            List<AwardsHonors> awardsHonors) {
        this.id = id;
        this.candidate = candidate;
        this.leisures = leisures;
        this.certications = certications;
        this.skills = skills;
        this.references = references;
        this.languages = languages;
        this.experiences = experiences;
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

    public UserEntity getCandidate() {
        return candidate;
    }

    public void setCandidate(UserEntity candidate) {
        this.candidate = candidate;
    }

    public List<String> getLeisures() {
        return leisures;
    }

    public void setLeisures(List<String> leisures) {
        this.leisures = leisures;
    }

    public List<Certificate> getCertications() {
        return certications;
    }

    public void setCertications(List<Certificate> certications) {
        this.certications = certications;
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

    public List<WorkExperience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<WorkExperience> experiences) {
        this.experiences = experiences;
    }

    public List<AwardsHonors> getAwardsHonors() {
        return awardsHonors;
    }

    public void setAwardsHonors(List<AwardsHonors> awardsHonors) {
        this.awardsHonors = awardsHonors;
    }
}
