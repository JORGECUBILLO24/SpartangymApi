package com.example.SpartanGym.Modelos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // Indica a JPA que esta clase es una entidad mapeada a una tabla
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Miembro {
    @Id // Define la llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esto hace que el valor sea auto incrementable
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(unique = true, nullable = false) // No permite que el campo nombre sea nulo
    private String dni;

    private String correo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plan_id")
    private PlanEntrenamiento plan;
}