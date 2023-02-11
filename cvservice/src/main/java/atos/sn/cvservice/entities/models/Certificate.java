package atos.sn.cvservice.entities.models;

public class Certificate {
    private String name;
    private int year;

    public Certificate(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Certificate() {
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
