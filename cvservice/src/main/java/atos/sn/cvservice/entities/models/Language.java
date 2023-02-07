package atos.sn.cvservice.entities.models;

public class Language {
    private String name;
    private String level;

    public Language(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public Language() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
