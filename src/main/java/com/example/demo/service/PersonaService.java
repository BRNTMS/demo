package com.example.demo.service;
import com.example.demo.persistence.Persona;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.persistence.PersonaRepository;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository pRepository){
        personaRepository = pRepository;
    }

    public List<Persona> recuperaPersone(){
        return personaRepository.findAll();
    }
}
