package atos.sn.cvservice.entities.models;

import java.time.LocalDate;

public class WorkExperience {
    private String company;
    private String jobTitle;
    private String projectDescription;
    private LocalDate startDate;
    private LocalDate endDate;

    public WorkExperience(String company, String jobTitle, String projectDescription, LocalDate startDate, LocalDate endDate) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.projectDescription = projectDescription;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public WorkExperience() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
