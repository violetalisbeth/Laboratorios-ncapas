package com.censo.hyrule.common;

import com.censo.hyrule.domain.entity.Material;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialList {

    private final List<Material> materials;

    public MaterialList() {
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1L)
                .nombre("Ambar Rojo")
                .categoria("Mineral")
                .efectoCocinado("Defensa")
                .precio(30)
                .ubicacionPrincipal("Cordillera de Hebra")
                .gradoRareza("Raro")
                .build());

        this.materials.add(Material.builder()
                .id(2L)
                .nombre("Ala de Keese")
                .categoria("Parte de Monstruo")
                .efectoCocinado("Sigilo")
                .precio(15)
                .ubicacionPrincipal("Volcan de Eldin")
                .gradoRareza("Comun")
                .build());

        this.materials.add(Material.builder()
                .id(3L)
                .nombre("Pimienta Ardiente")
                .categoria("Planta")
                .efectoCocinado("Ataque")
                .precio(10)
                .ubicacionPrincipal("Cordillera de Hebra")
                .gradoRareza("Poco Comun")
                .build());

        this.materials.add(Material.builder()
                .id(5L)
                .nombre("Escarabajo Incansable")
                .categoria("Insecto")
                .efectoCocinado("Estamina")
                .precio(50)
                .ubicacionPrincipal("Desierto Gerudo")
                .gradoRareza("Raro")
                .build());

        this.materials.add(Material.builder()
                .id(6L)
                .nombre("Fragmento de Dragón")
                .categoria("Mineral")
                .efectoCocinado("Ataque")
                .precio(350)
                .ubicacionPrincipal("Volcán de Eldin")
                .gradoRareza("Legendario")
                .build());

        this.materials.add(Material.builder()
                .id(8L)
                .nombre("Cuerno de Lynel")
                .categoria("Parte de Monstruo")
                .efectoCocinado("Ataque")
                .precio(175)
                .ubicacionPrincipal("Llanura de Hyrule")
                .gradoRareza("Legendario")
                .build());
    }

    public List<Material> getMaterials() {
        return materials;
    }
}