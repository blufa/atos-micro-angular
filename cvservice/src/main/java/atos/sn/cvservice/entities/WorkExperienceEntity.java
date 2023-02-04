package atos.sn.cvservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "WorkExperience")
public class WorkExperienceEntity {
    @Id
    private String id;
    private String company;
    private Date startDate;
    private Date endDate;
    private String jobTitle;
    private String task;
    private String certificate;
}
