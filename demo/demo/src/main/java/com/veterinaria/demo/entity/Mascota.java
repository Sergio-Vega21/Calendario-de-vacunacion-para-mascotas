package com.veterinaria.demo.entity;
import java.util.List;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mascota")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mascota {

    @Id
    @Column(name = "id_mascota", length = 5)
    private String idMascota;
    @Column(name = "nombre_mascota", length = 50, nullable = false)
    private String nombreMascota;
    @Column(name = "edad_mascota", nullable = false, precision = 2, scale = 0)
    private BigDecimal edadMascota;

    // relaciones
    @ManyToOne
    @JoinColumn(name = "cedula_encargado")
    private Encargado cedulaEncargado;

    @OneToMany(mappedBy = "mascota")
    @JsonManagedReference
    private List<MascotaConsulta> listaMascotaConsulta;

}
