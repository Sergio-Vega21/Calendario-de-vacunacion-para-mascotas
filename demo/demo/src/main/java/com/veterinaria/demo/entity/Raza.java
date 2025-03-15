package com.veterinaria.demo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="raza")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Raza
{
    @Id
    @Column(name = "id_raza",length = 4)
    private String idRaza;
    @Column(name = "nom_raza",length = 50)
    private String nomRaza;

    // relacion: 
    @OneToMany(mappedBy = "raza")
    @JsonManagedReference
    private List<EspecieRaza> listaEspecieRaza;


}