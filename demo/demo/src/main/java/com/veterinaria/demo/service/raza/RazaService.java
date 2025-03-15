package com.veterinaria.demo.service.raza;

import java.util.List;

import com.veterinaria.demo.entity.Raza;

public interface RazaService {
    
   List<Raza> findAll();

    Raza findById(String id);

    Raza save(Raza n);

    void deleteById(String id);

}
