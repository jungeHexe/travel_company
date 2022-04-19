package com.example.travelcompany.db.repository;

import com.example.travelcompany.db.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Country getOneById(Long Id);

}
