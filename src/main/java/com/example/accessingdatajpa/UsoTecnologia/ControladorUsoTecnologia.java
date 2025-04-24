package com.example.accessingdatajpa.UsoTecnologia;
import com.example.accessingdatajpa.UsoTecnologia.UsoTecnologia;
import com.example.accessingdatajpa.UsoTecnologia.UsoTecnologiaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/usotecnologia")
public class ControladorUsoTecnologia {
    private final UsoTecnologiaRepository repository;

    public ControladorUsoTecnologia(UsoTecnologiaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<UsoTecnologia> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public UsoTecnologia create(@RequestBody UsoTecnologia usoTecnologia) {
        return repository.save(usoTecnologia);
    }

    @GetMapping("/{id}")
    public Optional<UsoTecnologia> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
