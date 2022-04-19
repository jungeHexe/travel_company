package com.example.travelcompany.db.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Country extends BaseEntity<Long>{

    private String name;
    private String image;
    private Integer rating;

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Country setImage(String image) {
        this.image = image;
        return this;
    }

    public Integer getRating() {
        return rating;
    }

    public Country setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    @OneToMany(mappedBy="country", fetch = FetchType.LAZY)
    private Set<TourInfo> tours;

    public Set<TourInfo> getTours() {
        return tours;
    }

    public Country setTours(Set<TourInfo> tours) {
        this.tours = tours;
        return this;
    }
}
