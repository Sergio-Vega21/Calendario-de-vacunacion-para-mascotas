package com.veterinaria.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sede")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sede {
    
    @Id
    @Column(name="id_sede",length = 5)
    private String idSede; 
    @Column(name="nombre_sede",length = 50, nullable = false)
    private String nombreSede; 

     //relaciones:
     @OneToMany(mappedBy = "idSede")
     @JsonManagedReference
     private List<Consulta> listaConsultas;

}
