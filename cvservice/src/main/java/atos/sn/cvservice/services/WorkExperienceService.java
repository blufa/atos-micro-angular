package atos.sn.cvservice.services;


import java.util.List;

import atos.sn.cvservice.entities.WorkExperienceEntity;

public interface WorkExperienceService {
    WorkExperienceEntity addWorkExperience(WorkExperienceEntity workExperience);
    WorkExperienceEntity editWorkExperience(WorkExperienceEntity workExperience);
    List<WorkExperienceEntity> getWorkExperiences();

    WorkExperienceEntity getWorkExperience(String id);
    void deleteWorkExperience(String id);
}
