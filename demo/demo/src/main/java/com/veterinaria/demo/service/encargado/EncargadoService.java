package com.veterinaria.demo.service.encargado;
import java.util.List;
import com.veterinaria.demo.entity.Encargado;



public interface EncargadoService{

    List<Encargado> findAll();

    Encargado findById(String id);

    Encargado save(Encargado n);

    void deleteById(String id);

}