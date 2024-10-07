package edu.badpals.gamesBin;

public class Game {

    private String name;
    private String description;
    private String languages;

    public Game(String name, String description, String languages) {
        this.name = name;
        this.description = description;
        this.languages = languages;
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
}
