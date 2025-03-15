package com.veterinaria.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "especie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Especie{

    @Id
    @Column(name = "id_espcie", length = 4)
    private String idEspecie;
    
    @Column(name = "nom_especie", length = 50)
    private String nomEspecie;

    // relaciones : 
    @OneToMany(mappedBy = "especie")
    @JsonManagedReference
    List<EspecieRaza> listaEspecieRaza;

}