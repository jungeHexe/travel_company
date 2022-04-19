package com.example.travelcompany.db.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Hotel extends BaseEntity<Long>{

    private String name;
    private String link;

    @ManyToOne
    @JoinColumn(name="tour_id")
    private TourInfo tour;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private Set<BookedTrip> trips;

    public String getName() {
        return name;
    }

    public Hotel setName(String name) {
        this.name = name;
        return this;
    }

    public String getLink() {
        return link;
    }

    public Hotel setLink(String link) {
        this.link = link;
        return this;
    }

    public TourInfo getTour() {
        return tour;
    }

    public Hotel setTour(TourInfo tour) {
        this.tour = tour;
        return this;
    }

    public Set<BookedTrip> getTrips() {
        return trips;
    }

    public Hotel setTrips(Set<BookedTrip> trips) {
        this.trips = trips;
        return this;
    }
}
