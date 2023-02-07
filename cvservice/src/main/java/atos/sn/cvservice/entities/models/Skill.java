package atos.sn.cvservice.entities.models;

import atos.sn.cvservice.entities.enums.Level;

public class Skill {
    private String name;
    private Level level;

    public Skill(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
