package com.alkemy.disney.disney.services;


import com.alkemy.disney.disney.dto.PersonajeDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    public PersonajeDTO save(PersonajeDTO dto) {
        System.out.println("GUARDAR PERSONAJE");
        return dto;
    }
}
