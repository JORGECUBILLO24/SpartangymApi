package com.example.SpartanGym.servicios;
import com.example.SpartanGym.Modelos.Miembro;
import com.example.SpartanGym.Modelos.PlanEntrenamiento;
import com.example.SpartanGym.repository.MiembroRepository;
import com.example.SpartanGym.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpartanService {

    @Autowired
    private MiembroRepository miembroRepo;

    @Autowired
    private PlanRepository planRepo;

    // Métodos para Planes retorna todos los planes
    public List<PlanEntrenamiento> obtenerTodosLosPlanes() {
        return planRepo.findAll();
    }
//metodo para guardar todos los planes
    public PlanEntrenamiento guardarPlan(PlanEntrenamiento plan) {
        return planRepo.save(plan);
    }

    // Métodos para Miembros retorna a todos
    public List<Miembro> obtenerTodosLosMiembros() {
        return miembroRepo.findAll();
    }
  // guarda los miembros
    public Miembro guardarMiembro(Miembro miembro) {
        return miembroRepo.save(miembro);
    }
  //para eliminar los miembros
    public void eliminarMiembro(Long id) {
        miembroRepo.deleteById(id);
    }
}