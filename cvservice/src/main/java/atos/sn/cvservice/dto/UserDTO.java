package atos.sn.cvservice.dto;

import java.util.Date;
import java.util.Map;

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

    public UserDTO(String id, String address, Date dob, String email, String firstName, String lastName,
            String password, String phoneNumber, String occupation, String photo, Map<String, String> contactLinks) {
        this.id = id;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.photo = photo;
        this.contactLinks = contactLinks;
    }

    public UserDTO() {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
