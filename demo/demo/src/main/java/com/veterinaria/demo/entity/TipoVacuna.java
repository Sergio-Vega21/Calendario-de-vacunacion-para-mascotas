package com.veterinaria.demo.entity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="tipo_vacuna")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoVacuna
{
    @Id
    @Column(name = "id_tipo_vacuna",length = 5)
    private String idVacuna;
    @Column(name = "tipo_vacuna", length = 50)
    private String nombreVacuna;
    
    // relaciones
    @OneToMany(mappedBy = "tipoVacuna")
    @JsonManagedReference
    private List<Vacuna> listaVacunas;

}