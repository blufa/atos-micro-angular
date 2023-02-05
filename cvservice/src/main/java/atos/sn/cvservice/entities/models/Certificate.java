package atos.sn.cvservice.entities.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certificate {
    private String name;
    private Date date;
    private ObjectId resumeId;
}
