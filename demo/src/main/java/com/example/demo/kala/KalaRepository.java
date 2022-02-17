package com.example.demo.kala;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface KalaRepository extends JpaRepository<Kala,Long> {
}
