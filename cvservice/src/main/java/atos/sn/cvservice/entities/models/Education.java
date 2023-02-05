package atos.sn.cvservice.entities.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private String id;
    private String schoolName;
    private String diploma;
    private Date startDate;
    private Date endDate;
    private String resumeId;
}
