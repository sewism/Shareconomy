package de.htwberlin.webtech.web.api;

import java.time.LocalDateTime;

public class EntryManipulationRequest {

    private String titel;
    private String description;
    private LocalDateTime timestamp;
    private String category;
    private long zipcode;
    private String imageURL;
    private Long userId;

    public EntryManipulationRequest(String titel, String description, LocalDateTime timestamp, String category, long zipcode, String imageURL, Long userId) {
        this.titel = titel;
        this.description = description;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
