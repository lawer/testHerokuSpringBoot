package com.example.testheroku;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}