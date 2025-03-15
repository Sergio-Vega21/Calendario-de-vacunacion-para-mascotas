package com.veterinaria.demo.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="vacuna")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vacuna
{
    @Id
    @Column(name = "id_vacuna",length = 5)
    private String idVacuna;
    @Column(name = "nombre_vacuna", length = 50)
    private String nombreVacuna;
    
    // relaciones
    @ManyToOne
    @JoinColumn(name = "id_tipo_vacuna")
    @JsonBackReference
    private TipoVacuna tipoVacuna;

    
}