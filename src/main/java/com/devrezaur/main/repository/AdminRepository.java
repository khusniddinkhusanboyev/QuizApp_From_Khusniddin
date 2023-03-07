package com.devrezaur.main.repository;

import com.devrezaur.main.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Question , Integer> {
}
