package com.alkemy.disney.disney.controller;


import com.alkemy.disney.disney.dto.PersonajeDTO;
import com.alkemy.disney.disney.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje) {

        PersonajeDTO personajeGuardado = personajeService.save(personaje);

        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }
}
