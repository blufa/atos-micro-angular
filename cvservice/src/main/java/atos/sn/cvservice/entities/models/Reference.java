package atos.sn.cvservice.entities.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reference {
    private String fullName;
    private  String phoneNumber;
    private String email;
    private String jobTitle;
    private String company;
}
