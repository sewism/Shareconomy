package de.htwberlin.webtech.web.api;

import de.htwberlin.webtech.persistence.Category;

import java.time.LocalDateTime;

public class Entry {

    private long id;
    private String titel;
    private String description;
    private LocalDateTime timestamp;
    private String category;
    private long zipcode;
    private User user;

    public Entry(long id, String titel, String description, LocalDateTime timestamp, String category, long zipcode, User user) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

