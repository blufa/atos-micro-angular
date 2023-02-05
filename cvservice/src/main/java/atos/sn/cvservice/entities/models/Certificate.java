package atos.sn.cvservice.entities.models;

public class Certificate {
    private String name;
    private int date;

    public Certificate(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public Certificate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
