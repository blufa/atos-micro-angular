package atos.sn.cvservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cv")
public class CvEntity {
    private String id;
    private Set<String> interestActivities;
    private CertificateEntity certificate;
    private SkillEntity skills;
    private ReferenceEntity reference;
    private LanguageEntity language;
    private WorkExperienceEntity experience;
    private TrainingEntity training;

}
