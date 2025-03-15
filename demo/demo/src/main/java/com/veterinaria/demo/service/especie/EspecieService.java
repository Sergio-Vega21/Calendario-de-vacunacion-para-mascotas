package com.veterinaria.demo.service.especie;
import java.util.List;
import com.veterinaria.demo.entity.Especie;



public interface EspecieService{

    List<Especie> findAll();

    Especie findById(String id);

    Especie save(Especie n);

    void deleteById(String id);

}