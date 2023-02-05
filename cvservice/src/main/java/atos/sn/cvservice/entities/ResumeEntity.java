package atos.sn.cvservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import atos.sn.cvservice.entities.models.AwardsHonors;
import atos.sn.cvservice.entities.models.Certificate;
import atos.sn.cvservice.entities.models.Language;
import atos.sn.cvservice.entities.models.Reference;
import atos.sn.cvservice.entities.models.Skill;
import atos.sn.cvservice.entities.models.WorkExperience;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "resume")
public class ResumeEntity {
    @Id
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
