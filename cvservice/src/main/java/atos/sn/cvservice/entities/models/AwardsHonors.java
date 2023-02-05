package atos.sn.cvservice.entities.models;

public class AwardsHonors {
    private String name;
    private int year;

    public AwardsHonors(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public AwardsHonors() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
