package atos.sn.cvservice.entities.models;

import java.time.LocalDate;

public class Education {
    private String schoolName;
    private String diploma;
    private LocalDate startDate;
    private LocalDate endDate;

    public Education(String schoolName, String diploma, LocalDate startDate, LocalDate endDate) {
        this.schoolName = schoolName;
        this.diploma = diploma;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Education() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
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
