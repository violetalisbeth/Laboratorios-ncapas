package com.censo.hyrule.service;

import com.censo.hyrule.domain.entity.Material;
import com.censo.hyrule.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> obtenerTodos() {
        return materialRepository.findAll();
    }

    public List<Material> obtenerMaterialesOrdenadosPorPrecioDesc() {
        return materialRepository.findAll()
                .stream()
                .sorted((m1, m2) -> Integer.compare(m2.getPrecio(), m1.getPrecio()))
                .toList();
    }

    public Material obtenerMaterialMasCaro() {
        return materialRepository.findAll()
                .stream()
                .max(Comparator.comparing(Material::getPrecio))
                .orElse(null);
    }

    public List<Material> obtenerMaterialesLegendarios() {
        return materialRepository.findAll()
                .stream()
                .filter(material -> material.getGradoRareza().equalsIgnoreCase("Legendario"))
                .toList();
    }

    public List<String> obtenerUbicacionesUnicas() {
        return materialRepository.findAll()
                .stream()
                .map(Material::getUbicacionPrincipal)
                .distinct()
                .toList();
    }
}
