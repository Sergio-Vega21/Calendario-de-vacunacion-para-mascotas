package com.veterinaria.demo.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="consulta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consulta {
     
    @Id
    @Column(name = "id_consulta",length = 10)
    private String idConsulta;
    @Column(name = "fecha_consulta")
    private Date fechaConsulta;

    //relaciones:
    @ManyToOne
    @JoinColumn(name = "id_Sede")
    @JsonBackReference
    private Sede idSede;

    @ManyToOne
    @JoinColumn(name = "id_vacuna")
    @JsonBackReference
    private Vacuna idVacuna;

    @ManyToOne
    @JoinColumn(name = "cedula_veterinario")
    @JsonBackReference
    private Veterinario cedulaVeterinario;


}
