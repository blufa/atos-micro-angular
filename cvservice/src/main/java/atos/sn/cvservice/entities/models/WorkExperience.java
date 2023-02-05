package atos.sn.cvservice.entities.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {
    private String company;
    private String jobTitle;
    private String projectDescription;
    private List<String> accomplishments;
    private List<String> environment;
    private Date startDate;
    private Date endDate;
}
