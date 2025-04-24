package com.example.accessingdatajpa.Personaje;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import com.example.accessingdatajpa.Personaje.Personaje;
import com.example.accessingdatajpa.Personaje.PersonajeRespository;

@RestController
@RequestMapping("/personaje")
public class ControladorPersonaje {
    private final PersonajeRespository repository;

    public ControladorPersonaje(PersonajeRespository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Personaje> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> getById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Personaje create(@RequestBody Personaje personaje) {
        return repository.save(personaje);
    }

    @PutMapping("/{id}")
    public Personaje update(@PathVariable Long id, @RequestBody Personaje personaje) {
        return repository.save(personaje);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
