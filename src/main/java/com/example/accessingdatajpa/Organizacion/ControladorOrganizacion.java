package com.example.accessingdatajpa.Organizacion;
import com.example.accessingdatajpa.Organizacion.Organizacion;
import com.example.accessingdatajpa.Organizacion.OrganizacionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/organizacion")
public class ControladorOrganizacion {

    private final OrganizacionRepository repository;

    // Constructor correcto
    public ControladorOrganizacion(OrganizacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Organizacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Organizacion create(@RequestBody Organizacion organizacion) {
        return repository.save(organizacion);
    }

    @GetMapping("/{id}")
    public Optional<Organizacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
