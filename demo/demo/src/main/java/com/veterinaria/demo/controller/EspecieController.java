package com.veterinaria.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.demo.dto.EspecieDTO;
import com.veterinaria.demo.entity.Especie;
import com.veterinaria.demo.service.especie.EspecieService;
import lombok.RequiredArgsConstructor;

// localhost:8080/especie

@RestController
@RequestMapping("especie")
@RequiredArgsConstructor
public class EspecieController{

    private final EspecieService service;

    // localhost:8080/especie
    @GetMapping
    public List<Especie> findAll()
    {
        return service.findAll();
    }
    // localhost:8080/especie/{id} 
    @GetMapping("/{id}")
    public Especie getById(@PathVariable String id)
    {
        return service.findById(id);
    }
    // localhost:8080/especie
    @PostMapping
    public Especie save(@RequestBody EspecieDTO especieDTO)
    {
        Especie especie = Especie.builder()
                            .idEspecie(especieDTO.getIdEspecie())
                            .nomEspecie(especieDTO.getNomEspecie())
                            .build();
                            
        return service.save(especie);
    }
    /*
        {
            "idEspecie":"",
            "nomEspecie":""
        }
    */

   @PutMapping
    public Especie update(@RequestBody EspecieDTO especieDTO)
    {
        Especie especie = Especie.builder()
                            .idEspecie(especieDTO.getIdEspecie())
                            .nomEspecie(especieDTO.getNomEspecie())
                            .build();
                            
        return service.save(especie);
    }

   // localhost:8080/especie/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        service.deleteById(id);
    }


}
