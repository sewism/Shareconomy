package de.htwberlin.webtech.persistence;

import de.htwberlin.webtech.Category;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EntryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titel", nullable = false)
    private String titel;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "category")
    private Category category;

    @Column(name = "zipcode", nullable = false)
    private Long zipcode;

    @ManyToOne
    private UserEntity userEntity;

    public EntryEntity(String titel,
                       LocalDateTime timestamp,
                       Category category,
                       Long zipcode,
                       UserEntity userEntity) {
        this.titel = titel;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.userEntity = userEntity;
    }

    protected EntryEntity() {}

    public Long getId() {
        return id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }
}



