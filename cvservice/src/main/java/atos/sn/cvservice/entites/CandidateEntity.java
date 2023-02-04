package atos.sn.cvservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Candidate")
public class CandidateEntity {

    @Id
    private String id;
    private String LastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String address;
    private String position;
    private String photo;
    private Map<String, String> socialLinks;

}
