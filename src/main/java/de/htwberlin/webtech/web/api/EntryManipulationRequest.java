package de.htwberlin.webtech.web.api;

import de.htwberlin.webtech.Category;

import java.time.LocalDateTime;

public class EntryManipulationRequest {

    private String titel;
    private LocalDateTime timestamp;
    private Category category;
    private long zipcode;
    private User user;

    public EntryManipulationRequest(String titel, LocalDateTime timestamp, Category category, long zipcode, User user) {
        this.titel = titel;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.user = user;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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
