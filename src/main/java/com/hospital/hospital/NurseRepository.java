package com.hospital.hospital;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called nurseRepository
// CRUD refers Create, Read, Update, Delete
public interface NurseRepository extends JpaRepository<Nurse, String> {

    // Find a nurse by username and password (login)
    Optional<Nurse> findByUserAndPw(String user, String pw);

    // Find a nurse by name
    Optional<Nurse> findByName(String name);

}
