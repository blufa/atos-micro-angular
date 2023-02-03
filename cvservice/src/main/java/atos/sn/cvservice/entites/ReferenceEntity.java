package atos.sn.cvservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Reference")
public class ReferenceEntity {
    private String id;
    private String name;
    private  String phoneNumber;
    private String email;
    private String function;
    private String company;
}
