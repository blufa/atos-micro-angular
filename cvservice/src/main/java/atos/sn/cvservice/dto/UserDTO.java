package atos.sn.cvservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
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
