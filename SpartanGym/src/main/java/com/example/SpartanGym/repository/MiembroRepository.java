package com.example.SpartanGym.repository;



import com.example.SpartanGym.Modelos.Miembro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MiembroRepository extends JpaRepository<Miembro, Long> {
}