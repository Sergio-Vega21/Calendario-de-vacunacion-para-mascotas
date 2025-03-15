package com.veterinaria.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VeterinarioDTO {
    private String cedulaVeterinario;
    private String nombreVeterinario;
}
