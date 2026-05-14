package com.example.SpartanGym.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanEntrenamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;
    private Integer duracionSemanas;
    private Double precio;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Miembro> miembros;
}