package com.suren.springdocker.repository;

import com.suren.springdocker.entity.Errors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorsRepository extends JpaRepository<Errors, Long> {
}
