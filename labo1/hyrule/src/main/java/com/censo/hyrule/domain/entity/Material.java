package com.censo.hyrule.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Material {

    private long id;
    private String nombre;
    private String categoria;
    private String efectoCocinado;
    private int precio;
    private String ubicacionPrincipal;
    private String gradoRareza;
}