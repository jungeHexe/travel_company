package com.example.travelcompany.db.repository;

import com.example.travelcompany.db.entity.TourInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourInfoRepository extends JpaRepository<TourInfo, Long> {

    TourInfo getOneById(Long Id);

}
