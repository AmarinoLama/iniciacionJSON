package edu.badpals.gamesBin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String languages;
    private Map<String, String> comentaries = new HashMap<>();



    public Game(String name, String description, String languages, Map<String, String> comentaries) {
        this.name = name;
        this.description = description;
        this.languages = languages;
        this.comentaries = comentaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Map<String, String> getComentaries() {
        return comentaries;
    }

    public void setComentaries(Map<String, String> comentaries) {
        this.comentaries = comentaries;
    }

    @Override
    public String toString() {
        return "Game{name='" + name + "', description='" + description + "', languages='" + languages + "'}";
    }
}
