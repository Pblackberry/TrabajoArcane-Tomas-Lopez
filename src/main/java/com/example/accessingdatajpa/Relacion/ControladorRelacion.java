package com.example.accessingdatajpa.Relacion;
import com.example.accessingdatajpa.Relacion.Relacion;
import com.example.accessingdatajpa.Relacion.RelacionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/relacion")
public class ControladorRelacion {
    private final RelacionRepository repository;

    public ControladorRelacion(RelacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Relacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Relacion create(@RequestBody Relacion relacion) {
        return repository.save(relacion);
    }

    @GetMapping("/{id}")
    public Optional<Relacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
