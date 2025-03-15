package com.veterinaria.demo.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.veterinaria.demo.entity.ERPk.EspecieRazaPK;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="especie_raza")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspecieRaza{

    @EmbeddedId
    private EspecieRazaPK id;

    //relaciones
    @ManyToOne
    @JoinColumn(name = "id_espcie",insertable = false, updatable = false)
    @JsonBackReference
    private Especie especie;
    @ManyToOne
    @JoinColumn(name = "id_raza",insertable = false, updatable = false)
    @JsonBackReference
    private Raza raza;

}