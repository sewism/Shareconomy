package de.htwberlin.webtech.persistence;

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
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Column(name = "zipcode", nullable = false)
    private Long zipcode;

    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    public EntryEntity(String titel,
                       LocalDateTime timestamp,
                       Category category,
                       Long zipcode,
                       UserEntity user) {
        this.titel = titel;
        this.timestamp = timestamp;
        this.category = category;
        this.zipcode = zipcode;
        this.user = user;
    }

    protected EntryEntity(){}

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

    public void setUser(UserEntity userEntity) {
        this.user = userEntity;
    }

    public UserEntity getUser() {
        return user;
    }
}



