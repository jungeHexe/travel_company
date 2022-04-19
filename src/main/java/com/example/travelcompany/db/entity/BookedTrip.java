package com.example.travelcompany.db.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name="booked_trip")
public class BookedTrip extends BaseEntity<Long>{

    private LocalTime timeDeparture;

    @ManyToOne
    @JoinColumn(name="tour_id")
    private TourInfo tour;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public BookedTrip setTimeDeparture(LocalTime timeDeparture) {
        this.timeDeparture = timeDeparture;
        return this;
    }

    public TourInfo getTour() {
        return tour;
    }

    public BookedTrip setTour(TourInfo tour) {
        this.tour = tour;
        return this;
    }

    public User getUser() {
        return user;
    }

    public BookedTrip setUser(User user) {
        this.user = user;
        return this;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public BookedTrip setHotel(Hotel hotel) {
        this.hotel = hotel;
        return this;
    }
}
