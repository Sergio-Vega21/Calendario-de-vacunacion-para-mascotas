package com.veterinaria.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.veterinaria.demo.entity.MCPK.MascotaConsultaPK;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="mascota_consulta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MascotaConsulta {

    @EmbeddedId
    private MascotaConsultaPK id;

    @ManyToOne
    @JoinColumn(name = "id_mascota",insertable = false, updatable = false)
    @JsonBackReference
    private Mascota mascota;
    
}   
