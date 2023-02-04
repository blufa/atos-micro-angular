package atos.sn.cvservice.services;


import atos.sn.cvservice.entites.WorkExperienceEntity;

import java.util.List;

public interface WorkExperienceService {
    WorkExperienceEntity addWorkExperience(WorkExperienceEntity workExperience);
    WorkExperienceEntity editWorkExperience(WorkExperienceEntity workExperience);
    List<WorkExperienceEntity> getWorkExperiences();

    WorkExperienceEntity getWorkExperience(String id);
    void deleteWorkExperience(String id);
}
