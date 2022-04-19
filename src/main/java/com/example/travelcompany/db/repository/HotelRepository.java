package com.example.travelcompany.db.repository;

import com.example.travelcompany.db.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel getOneById(Long Id);
}
