package com.veterinaria.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EspecieDTO {
    private String idEspecie;
    private String nomEspecie;
}
