package atos.sn.cvservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Document(collection = "candidates")
public class CandidateEntity {
    @Id
    private String id;
    private String address;
    private LocalDate dob;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String occupation;
    private String photo;
    private List<String> contactLinks;

    public CandidateEntity(String id, String address, LocalDate dob, String email, String firstName,
            String lastName,
            String phoneNumber, String occupation, String photo, List<String> contactLinks) {
        this.id = id;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.photo = photo;
        this.contactLinks = contactLinks;
    }

    public CandidateEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(String dob) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dob = LocalDate.parse(dob, dateTimeFormatter);
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<String> getContactLinks() {
        return contactLinks;
    }

    public void setContactLinks(List<String> contactLinks) {
        this.contactLinks = contactLinks;
    }
}
