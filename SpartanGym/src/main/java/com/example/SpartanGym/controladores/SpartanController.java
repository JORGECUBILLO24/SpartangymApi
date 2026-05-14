package com.example.SpartanGym.controladores;



import com.example.SpartanGym.Modelos.Miembro;
import com.example.SpartanGym.Modelos.PlanEntrenamiento;
import com.example.SpartanGym.servicios.SpartanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/spartan")
public class SpartanController {

    @Autowired
    private SpartanService spartanService;

    // --- ENDPOINTS PARA PLANES ---
    @GetMapping("/planes")
    public List<PlanEntrenamiento> listarPlanes() {
        return spartanService.obtenerTodosLosPlanes();
    }

    @PostMapping("/planes")
    public PlanEntrenamiento crearPlan(@RequestBody PlanEntrenamiento plan) {
        return spartanService.guardarPlan(plan);
    }


    @GetMapping("/miembros")
    public List<Miembro> listarMiembros() {
        return spartanService.obtenerTodosLosMiembros();
    }

    @PostMapping("/miembros")
    public ResponseEntity<Miembro> crearMiembro(@RequestBody Miembro miembro) {
        return ResponseEntity.ok(spartanService.guardarMiembro(miembro));
    }

    @DeleteMapping("/miembros/{id}")
    public void eliminarMiembro(@PathVariable Long id) {
        spartanService.eliminarMiembro(id);
    }
}