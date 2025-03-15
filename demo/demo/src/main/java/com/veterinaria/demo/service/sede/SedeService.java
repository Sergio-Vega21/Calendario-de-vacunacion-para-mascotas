package com.veterinaria.demo.service.sede;

import java.util.List;

import com.veterinaria.demo.entity.Sede;

public interface SedeService {
    
   List<Sede> findAll();

    Sede findById(String id);

    Sede save(Sede n);

    void deleteById(String id);

}
