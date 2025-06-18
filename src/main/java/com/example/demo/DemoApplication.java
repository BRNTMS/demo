package com.example.demo;

import com.example.demo.persistence.Persona;
import com.example.demo.persistence.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private PersonaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		Persona persona = new Persona();
		persona.setNome("Bruno");
		persona.setCognome("Timeus");
		Persona persona2 = new Persona();
		persona2.setNome("Simone");
		persona2.setCognome("Bierti");

		repository.saveAll(List.of(persona,persona2));
	}

}
