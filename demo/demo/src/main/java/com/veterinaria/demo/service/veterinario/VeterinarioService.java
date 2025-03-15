package com.veterinaria.demo.service.veterinario;
import java.util.List;
import com.veterinaria.demo.entity.Veterinario;



public interface VeterinarioService{

    List<Veterinario> findAll();

    Veterinario findById(String id);

    Veterinario save(Veterinario n);

    void deleteById(String id);

}