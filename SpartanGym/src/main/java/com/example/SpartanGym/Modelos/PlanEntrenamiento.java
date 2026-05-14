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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Que esto se auto incremente
    private Long id;

    @Column(nullable = false) // no permite campo nulo
    private String nombre;

    private String descripcion;
    private Integer duracionSemanas;
    private Double precio;
//Relación Uno a Muchos (Un plan contiene muchos miembros).
    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
   //
    @JsonIgnore
    //evita un bucle infinito (recursividad) al generar la respuesta JSON en Postman.
    private List<Miembro> miembros;
}