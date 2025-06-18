package com.example.demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.PersonaService;

@Controller
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService pService){
        personaService = pService;
    }

    @GetMapping("/persone")
    public ModelAndView trovaPersone(){
        return new ModelAndView("persone", "persone", personaService.recuperaPersone());
    }
}
