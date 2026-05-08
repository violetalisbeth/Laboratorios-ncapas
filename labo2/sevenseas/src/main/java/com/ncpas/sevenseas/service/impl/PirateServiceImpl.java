package com.ncpas.sevenseas.service.impl;

import com.ncpas.sevenseas.domain.entity.Pirate;
import com.ncpas.sevenseas.repository.PirateRepository;
import com.ncpas.sevenseas.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {

    private final PirateRepository pirateRepository;

    @Override
    public void createPirate(Pirate pirate) {
        pirateRepository.save(pirate);
    }

    @Override
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return pirateRepository.findById(id).orElseThrow();
    }

    @Override
    public void updatePirate(UUID id, Pirate pirate) {
        Pirate existPirate = pirateRepository.findById(id).orElseThrow();

        existPirate.setName(pirate.getName());
        existPirate.setBounty(pirate.getBounty());
        existPirate.setCrew(pirate.getCrew());
        existPirate.setIsAlive(pirate.getIsAlive());

        pirateRepository.save(existPirate);
    }

    @Override
    public Pirate deletePirate(UUID id) {
        Pirate existPirate = pirateRepository.findById(id).orElseThrow();
        pirateRepository.deleteById(id);
        return existPirate;
    }
}