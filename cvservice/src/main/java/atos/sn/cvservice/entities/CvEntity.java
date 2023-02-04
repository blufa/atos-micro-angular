package atos.sn.cvservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cv")
public class CvEntity {
    @Id
    private String id;
    private List<String> interestActivities;
    private List<CertificateEntity> certificates;
    private List<SkillEntity> skills;
    private List<ReferenceEntity> references;
    private List<LanguageEntity> languages;
    private List<WorkExperienceEntity> experiences;
    private List<TrainingEntity> trainings;

}
