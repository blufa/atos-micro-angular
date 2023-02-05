package atos.sn.cvservice.entities.models;

public class Reference {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String jobTitle;
    private String company;

    public Reference(String fullName, String phoneNumber, String email, String jobTitle, String company) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public Reference() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
