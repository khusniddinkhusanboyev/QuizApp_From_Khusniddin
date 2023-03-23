package com.devrezaur.main.repository;

import com.devrezaur.main.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminValidationRepository extends JpaRepository<Admin,Long> {
}
