package atos.sn.cvservice.services;

import sn.atos.cv.entites.WorkExperienceEntity;

import java.util.List;

public interface WorkExperienceService {
    WorkExperienceEntity addWorkExperience(WorkExperienceEntity workExperience);
    WorkExperienceEntity editWorkExperience(WorkExperienceEntity workExperience);
    List<WorkExperienceEntity> getWorksExperiences();

    WorkExperienceEntity getWorkExperience(String id);
    void delete(String id);
}
