package de.htwberlin.webtech.web.api;

import java.util.List;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Long> entries;

    public User(long id, String firstName, String lastName, String email, List<Long> entries) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.entries = entries;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getEntries() {
        return entries;
    }

    public void setEntries(List<Long> entries) {
        this.entries = entries;
    }
}
