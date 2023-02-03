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
@Document(collection = "Certificate")
public class CertificateEntity {
    @Id
    private String id;
    private String name;
    private Date date;
    private String scanning;
}
