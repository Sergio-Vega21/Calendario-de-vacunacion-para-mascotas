package com.veterinaria.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.demo.entity.Sede;

public interface SedeRepository extends JpaRepository<Sede,String>{

}