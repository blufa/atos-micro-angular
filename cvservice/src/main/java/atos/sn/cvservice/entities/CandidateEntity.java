package atos.sn.cvservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Document(collection = "candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateEntity {

    @Id
    private String id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String address;
    private String position;
    private String photo;
    private Map<String, String> socialLinks;

}
