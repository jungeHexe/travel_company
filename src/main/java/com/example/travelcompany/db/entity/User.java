package com.example.travelcompany.db.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="users")
public class User extends BaseEntity<Long>{

    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<BookedTrip> trips;

    public Set<BookedTrip> getTrips() {
        return trips;
    }

    public User setTrips(Set<BookedTrip> trips) {
        this.trips = trips;
        return this;
    }
}
