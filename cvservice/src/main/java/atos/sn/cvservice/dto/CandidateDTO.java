package atos.sn.cvservice.dto;

import java.time.LocalDate;
import java.util.Map;

public class CandidateDTO {
    private String id;
    private String address;
    private String dob;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String occupation;
    private String photo;
    private Map<String, String> contactLinks;

    public CandidateDTO(String id, String address, String dob, String email, String firstName, String lastName,
            String phoneNumber, String occupation, String photo, Map<String, String> contactLinks) {
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

    public CandidateDTO() {
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

    public String getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob.toString();
    }

    public void setDob(String dob) {
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

    public Map<String, String> getContactLinks() {
        return contactLinks;
    }

    public void setContactLinks(Map<String, String> contactLinks) {
        this.contactLinks = contactLinks;
    }
}
