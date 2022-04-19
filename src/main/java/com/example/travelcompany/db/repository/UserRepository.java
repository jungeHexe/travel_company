package com.example.travelcompany.db.repository;

import com.example.travelcompany.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getOneById(Long Id);
}
