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

import com.veterinaria.demo.dto.EncargadoDTO;
import com.veterinaria.demo.entity.Encargado;
import com.veterinaria.demo.service.encargado.EncargadoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("encargado")
@RequiredArgsConstructor
public class EncargadoController{

    private final EncargadoService service;

    @GetMapping
    public List<Encargado> findAll()
    {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Encargado getById(@PathVariable String id)
    {
        return service.findById(id);
    }
    @PostMapping
    public Encargado save(@RequestBody EncargadoDTO encargadoDTO)
    {
        Encargado especie = Encargado.builder()
                            .cedulaEncargado(encargadoDTO.getCedulaEncargado())
                            .nombreEncargado(encargadoDTO.getNombreEncargado())
                            .telefonoEncargado(encargadoDTO.getTelefonoEncargado())
                            .build();
                            
        return service.save(especie);
    }

   @PutMapping
    public Encargado update(@RequestBody EncargadoDTO especieDTO)
    {
        Encargado encargado = Encargado.builder()
                            .cedulaEncargado(especieDTO.getCedulaEncargado())
                            .nombreEncargado(especieDTO.getNombreEncargado())
                            .build();
                            
        return service.save(encargado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        service.deleteById(id);
    }


}
