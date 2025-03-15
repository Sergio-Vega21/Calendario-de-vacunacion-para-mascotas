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

import com.veterinaria.demo.dto.VeterinarioDTO;
import com.veterinaria.demo.entity.Veterinario;
import com.veterinaria.demo.service.veterinario.VeterinarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("veterinario")
@RequiredArgsConstructor
public class VeterinarioController{

    private final VeterinarioService service;

    @GetMapping
    public List<Veterinario> findAll()
    {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Veterinario getById(@PathVariable String id)
    {
        return service.findById(id);
    }
    @PostMapping
    public Veterinario save(@RequestBody VeterinarioDTO especieDTO)
    {
        Veterinario especie = Veterinario.builder()
                            .cedulaVeterinario(especieDTO.getCedulaVeterinario())
                            .nombreVeterinario(especieDTO.getNombreVeterinario())
                            .build();
                            
        return service.save(especie);
    }

   @PutMapping
    public Veterinario update(@RequestBody VeterinarioDTO especieDTO)
    {
        Veterinario encargado = Veterinario.builder()
                            .cedulaVeterinario(especieDTO.getCedulaVeterinario())
                            .nombreVeterinario(especieDTO.getNombreVeterinario())
                            .build();
                            
        return service.save(encargado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        service.deleteById(id);
    }


}
