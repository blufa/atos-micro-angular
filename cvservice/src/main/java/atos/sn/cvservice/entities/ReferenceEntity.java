package atos.sn.cvservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Reference")
public class ReferenceEntity {
    @Id
    private String id;
    private String fullName;
    private  String phoneNumber;
    private String email;
    private String position;
    private String company;
}
