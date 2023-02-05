package atos.sn.cvservice.entities.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardsHonors {
    private String name;
    private Date year;
    private String resumeId;
}
