package com.veterinaria.demo.service.encargado;
import java.util.List;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.demo.dao.EncargadoRepository;
import com.veterinaria.demo.entity.Encargado;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EncargadoServiceImpl implements EncargadoService{

    private final EncargadoRepository repository;


    @Override
    public List<Encargado> findAll() {
        return repository.findAll();
    }

    @Override
    public Encargado findById(String id){
        Optional<Encargado> optional = repository.findById(id);
        return optional.get();
    }

    @Override 
    public Encargado save(Encargado especie)
    {
        return repository.save(especie);
    }

    @Override
    public void deleteById(String id){
        repository.deleteById(id);
    }

    
}