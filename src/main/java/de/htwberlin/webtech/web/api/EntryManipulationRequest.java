package de.htwberlin.webtech.web.api;

import de.htwberlin.webtech.persistence.Category;

import java.time.LocalDateTime;

public class EntryManipulationRequest {

    private String titel;
    private String description;
    private LocalDateTime timestamp;
    private String category;
    private long zipcode;
    private Long userId;

    public EntryManipulationRequest(String titel, String description, LocalDateTime timestamp, String category, long zipcode, Long userId) {
        this.titel = titel;
        this.description = description;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.userId = userId;
    }

    public EntryManipulationRequest() {}

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
