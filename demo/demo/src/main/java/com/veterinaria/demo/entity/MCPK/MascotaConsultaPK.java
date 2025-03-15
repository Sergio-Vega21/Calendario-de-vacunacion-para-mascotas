package com.veterinaria.demo.entity.MCPK;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class MascotaConsultaPK implements Serializable{

    @Column(name = "id_consulta", length = 10)
    private String idConsulta;
    @Column(name="id_mascota",length = 5)
    private String idMascota;


}