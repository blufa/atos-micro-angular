package atos.sn.cvservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {
    @Id
    private String id;
    private String address;
    private Date dob;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String occupation;
    private String photo;
    private Map<String, String> contactLinks;
}
