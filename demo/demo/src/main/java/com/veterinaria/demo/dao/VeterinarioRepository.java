package com.veterinaria.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.demo.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario,String>{

}

