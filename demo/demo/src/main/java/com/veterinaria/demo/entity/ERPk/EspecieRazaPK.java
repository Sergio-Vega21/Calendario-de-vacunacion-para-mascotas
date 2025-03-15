package com.veterinaria.demo.entity.ERPk;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class EspecieRazaPK implements Serializable{

    @Column(name = "id_raza", length = 4)
    private String idRaza;
    @Column(name="id_espcie",length = 4)
    private String idEspecie;


}