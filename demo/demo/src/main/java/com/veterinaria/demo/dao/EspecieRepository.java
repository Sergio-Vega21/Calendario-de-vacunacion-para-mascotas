package com.veterinaria.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.demo.entity.Especie;

public interface EspecieRepository extends JpaRepository<Especie,String>{

}