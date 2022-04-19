package com.example.travelcompany.db.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tour_info")
public class TourInfo extends BaseEntity<Long>{

    private String name;
    private String description;
    private int raiting;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    private String image;
    private int numberDays;
    private double cost;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate date_departure;
    private String point_departure;
    private String point_arrival;

    public String getName() {
        return name;
    }

    public TourInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TourInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getRaiting() {
        return raiting;
    }

    public TourInfo setRaiting(int raiting) {
        this.raiting = raiting;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public TourInfo setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getImage() {
        return image;
    }

    public TourInfo setImage(String image) {
        this.image = image;
        return this;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public TourInfo setNumberDays(int numberDays) {
        this.numberDays = numberDays;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public TourInfo setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public LocalDate getDate_departure() {
        return date_departure;
    }

    public TourInfo setDate_departure(LocalDate date_departure) {
        this.date_departure = date_departure;
        return this;
    }

    public String getPoint_departure() {
        return point_departure;
    }

    public TourInfo setPoint_departure(String point_departure) {
        this.point_departure = point_departure;
        return this;
    }

    public String getPoint_arrival() {
        return point_arrival;
    }

    public TourInfo setPoint_arrival(String point_arrival) {
        this.point_arrival = point_arrival;
        return this;
    }

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private Set<Hotel> hotels;

    public Set<Hotel> getHotels() {
        return hotels;
    }

    public TourInfo setHotels(Set<Hotel> hotels) {
        this.hotels = hotels;
        return this;
    }

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private Set<BookedTrip> trips;

    public Set<BookedTrip> getTrips() {
        return trips;
    }

    public TourInfo setTrips(Set<BookedTrip> trips) {
        this.trips = trips;
        return this;
    }
}
