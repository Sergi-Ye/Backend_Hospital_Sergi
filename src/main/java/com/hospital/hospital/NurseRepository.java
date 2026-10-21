package com.hospital.hospital;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring automatically implements this repository
// CRUD refers to Create, Read, Update and Delete
public interface NurseRepository extends JpaRepository<Nurse, Integer> {

    // Find a nurse by username and password (login)
    Optional<Nurse> findByUserAndPw(String username, String password);

    // Find a nurse by first name
    Optional<Nurse> findByName(String firstName);
}