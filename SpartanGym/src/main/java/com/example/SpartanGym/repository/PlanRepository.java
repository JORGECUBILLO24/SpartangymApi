package com.example.SpartanGym.repository;


import com.example.SpartanGym.Modelos.PlanEntrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<PlanEntrenamiento, Long> {
}