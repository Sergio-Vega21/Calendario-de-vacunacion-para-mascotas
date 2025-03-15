package com.veterinaria.demo.service.sede;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.veterinaria.demo.dao.SedeRepository;
import com.veterinaria.demo.entity.Sede;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SedeServiceImpl implements SedeService{

    private final SedeRepository repository;


    @Override
    public List<Sede> findAll() {
        return repository.findAll();
    }

    @Override
    public Sede findById(String id){
        Optional<Sede> optional = repository.findById(id);
        return optional.get();
    }

    @Override 
    public Sede save(Sede especie)
    {
        return repository.save(especie);
    }

    @Override
    public void deleteById(String id){
        repository.deleteById(id);
    }

    
}