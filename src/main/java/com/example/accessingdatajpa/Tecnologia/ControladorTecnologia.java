package com.example.accessingdatajpa.Tecnologia;
import com.example.accessingdatajpa.Tecnologia.Tecnologia;
import com.example.accessingdatajpa.Tecnologia.TecnologiaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tecnologia")
public class ControladorTecnologia {
    private final TecnologiaRepository repository;

    public ControladorTecnologia(TecnologiaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Tecnologia> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Tecnologia create(@RequestBody Tecnologia tecnologia) {
        return repository.save(tecnologia);
    }

    @GetMapping("/{id}")
    public Optional<Tecnologia> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
