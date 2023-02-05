package atos.sn.cvservice.dto;

import java.util.List;

import atos.sn.cvservice.entities.UserEntity;
import atos.sn.cvservice.entities.models.AwardsHonors;
import atos.sn.cvservice.entities.models.Certificate;
import atos.sn.cvservice.entities.models.Language;
import atos.sn.cvservice.entities.models.Reference;
import atos.sn.cvservice.entities.models.Skill;
import atos.sn.cvservice.entities.models.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
