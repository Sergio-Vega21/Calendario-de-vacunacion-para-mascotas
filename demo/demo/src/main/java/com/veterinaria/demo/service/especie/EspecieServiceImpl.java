package com.veterinaria.demo.service.especie;
import java.util.List;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.demo.dao.EspecieRepository;
import com.veterinaria.demo.entity.Especie;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EspecieServiceImpl implements EspecieService{

    private final EspecieRepository repository;


    @Override
    public List<Especie> findAll() {
        return repository.findAll();
    }

    @Override
    public Especie findById(String id){
        Optional<Especie> optional = repository.findById(id);
        return optional.get();
    }

    @Override 
    public Especie save(Especie especie)
    {
        return repository.save(especie);
    }

    @Override
    public void deleteById(String id){
        repository.deleteById(id);
    }

    
}