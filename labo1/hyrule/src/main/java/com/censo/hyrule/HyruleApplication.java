package com.censo.hyrule;

import com.censo.hyrule.domain.entity.Material;
import com.censo.hyrule.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HyruleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyruleApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService) {
        return args -> {

            System.out.println("==== CATALOGO COMPLETO DE HYRULE ====");
            materialService.obtenerTodos().forEach(material ->
                    System.out.println("ID: " + material.getId()
                            + " | Nombre: " + material.getNombre()
                            + " | Categoria: " + material.getCategoria()
                            + " | Precio: " + material.getPrecio())
            );

            System.out.println("\n=== MATERIALES ORDENADOS ====");
            materialService.obtenerMaterialesOrdenadosPorPrecioDesc().forEach(material ->
                    System.out.println("Nombre: " + material.getNombre()
                            + " | Precio: " + material.getPrecio())
            );

            System.out.println("\n=== MATERIAL MAS CARO ====");
            Material materialMasCaro = materialService.obtenerMaterialMasCaro();
            if (materialMasCaro != null) {
                System.out.println("ID: " + materialMasCaro.getId()
                        + " | Nombre: " + materialMasCaro.getNombre()
                        + " | Precio: " + materialMasCaro.getPrecio());
            }

            System.out.println("\n=== MATERIALES LEGENDARIOS ====");
            materialService.obtenerMaterialesLegendarios().forEach(material ->
                    System.out.println("Nombre: " + material.getNombre()
                            + " | Rareza: " + material.getGradoRareza())
            );

            System.out.println("\n=== UBICACIONES UNICAS ====");
            materialService.obtenerUbicacionesUnicas().forEach(System.out::println);
        };
    }
}