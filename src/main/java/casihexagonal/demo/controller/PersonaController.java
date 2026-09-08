package casihexagonal.demo.controller;

import casihexagonal.demo.domain.Persona;
import casihexagonal.demo.repository.PersonaRepository;
import casihexagonal.demo.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nucleo/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @GetMapping("/")
    public ResponseEntity<List<Persona>> getAll(){
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        return ResponseEntity.ok(personaService.save(persona));
    }
}
