package com.example.SpartanGym.Modelos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String dni;

    private String correo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plan_id")
    private PlanEntrenamiento plan;
}