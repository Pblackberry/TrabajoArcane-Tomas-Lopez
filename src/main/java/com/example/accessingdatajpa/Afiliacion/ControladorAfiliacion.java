package com.example.accessingdatajpa.Afiliacion;
import com.example.accessingdatajpa.Afiliacion.Afiliacion;
import com.example.accessingdatajpa.Afiliacion.AfiliacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/afiliacion")
public class ControladorAfiliacion {
    private final AfiliacionRepository repository;
    public ControladorAfiliacion(AfiliacionRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public Iterable<Afiliacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Afiliacion create(@RequestBody Afiliacion afiliacion) {
        return repository.save(afiliacion);
    }

    @GetMapping("/{id}")
    public Optional<Afiliacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
