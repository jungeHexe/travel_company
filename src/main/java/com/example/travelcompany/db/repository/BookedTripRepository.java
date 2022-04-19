package com.example.travelcompany.db.repository;

import com.example.travelcompany.db.entity.BookedTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedTripRepository extends JpaRepository<BookedTrip, Long> {

    BookedTrip getOneById(Long Id);

}
