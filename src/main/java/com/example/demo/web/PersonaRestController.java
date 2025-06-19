package com.example.demo.web;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.persistence.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaRestController {
    private final PersonaService personaService;

    public PersonaRestController(PersonaService pService){
        personaService = pService;
    }
    
    @GetMapping("/persone")
    public ResponseEntity<List<Persona>> mostraPersone(){
        return ResponseEntity.ok().body(personaService.recuperaPersone());
    }

    @PostMapping("/persona")
    public ResponseEntity<Persona> creaPersona(@RequestBody Persona persona) 
    throws URISyntaxException{
        Persona personaSalvata = personaService.salvaPersona(persona);
        return ResponseEntity.created(new URI("/api/persone/" + personaSalvata.getId())).body(personaSalvata);
    }
}
