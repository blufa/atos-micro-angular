package atos.sn.cvservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Training")
public class TrainingEntity {
    @Id
    private String id;
    private String instruction;
    private String diploma;
    private String trainingTitle;
    private Date startDate;
    private Date endDate;
    private Boolean diplomaObtained;
    private String diplomaScan;

}
