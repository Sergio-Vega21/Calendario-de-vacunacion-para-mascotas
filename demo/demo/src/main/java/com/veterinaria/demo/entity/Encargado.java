package com.veterinaria.demo.entity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="encargado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Encargado {
    
    @Id
    @Column(name="cedula_encargado",length = 10)
    private String cedulaEncargado; 
    @Column(name="nombre_encargado",length = 50, nullable = false)
    private String nombreEncargado; 
    @Column(name="telefono_encargado",length = 10, nullable = false)
    private String telefonoEncargado; 

    //relacion:
    @OneToMany(mappedBy = "cedulaEncargado")
    @JsonManagedReference
    private List<Mascota> listaMascota;


}
