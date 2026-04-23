package com.censo.hyrule.repository;

import com.censo.hyrule.common.MaterialList;
import com.censo.hyrule.domain.entity.Material;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialRepository {

    private final MaterialList materialList;

    public MaterialRepository(MaterialList materialList) {
        this.materialList = materialList;
    }

    public List<Material> findAll() {
        return materialList.getMaterials();
    }
}