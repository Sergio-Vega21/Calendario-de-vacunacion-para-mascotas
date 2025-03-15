package com.veterinaria.demo.service.veterinario;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.veterinaria.demo.dao.VeterinarioRepository;
import com.veterinaria.demo.entity.Veterinario;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VeterinarioServiceImpl implements VeterinarioService{

    private final VeterinarioRepository repository;


    @Override
    public List<Veterinario> findAll() {
        return repository.findAll();
    }

    @Override
    public Veterinario findById(String id){
        Optional<Veterinario> optional = repository.findById(id);
        return optional.get();
    }

    @Override 
    public Veterinario save(Veterinario especie)
    {
        return repository.save(especie);
    }

    @Override
    public void deleteById(String id){
        repository.deleteById(id);
    }

    
}