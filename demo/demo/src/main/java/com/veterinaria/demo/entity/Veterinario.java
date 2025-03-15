package com.veterinaria.demo.entity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="veterinario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Veterinario
{
    @Id
    @Column(name = "cedula_veterinario",length = 10)
    private String cedulaVeterinario;
    @Column(name = "nombre_veterinario",length = 50)
    private String nombreVeterinario;

     //relaciones:
     @OneToMany(mappedBy = "cedulaVeterinario")
     @JsonManagedReference
     private List<Consulta> listaVeterinario;

}


