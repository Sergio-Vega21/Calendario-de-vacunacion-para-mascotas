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

import com.veterinaria.demo.dto.SedeDTO;
import com.veterinaria.demo.entity.Sede;
import com.veterinaria.demo.service.sede.SedeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("sede")
@RequiredArgsConstructor
public class SedeController{

    private final SedeService service;

    @GetMapping
    public List<Sede> findAll()
    {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Sede getById(@PathVariable String id)
    {
        return service.findById(id);
    }
    @PostMapping
    public Sede save(@RequestBody SedeDTO especieDTO)
    {
        Sede sede = Sede.builder()
                            .idSede(especieDTO.getIdSede())
                            .nombreSede(especieDTO.getNombreSede())
                            .build();
                            
        return service.save(sede);
    }

   @PutMapping
    public Sede update(@RequestBody SedeDTO especieDTO)
    {
         Sede sede = Sede.builder()
                            .idSede(especieDTO.getIdSede())
                            .nombreSede(especieDTO.getNombreSede())
                            .build();
                            
        return service.save(sede);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        service.deleteById(id);
    }


}
