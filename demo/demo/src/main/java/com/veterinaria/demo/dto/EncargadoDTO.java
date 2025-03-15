package com.veterinaria.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EncargadoDTO {
    private String cedulaEncargado;
    private String nombreEncargado;
    private String telefonoEncargado;

}
