package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.controller.FamilyController;
import com.justin.RPGMonsterCatalogServer.model.Family;
import com.justin.RPGMonsterCatalogServer.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {
    private FamilyRepository repository;

    @Autowired
    public FamilyService(FamilyRepository repository) {
        this.repository = repository;
    }

    public List<Family> readAll() {
        return repository.findAll();
    }

    public Family readById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Family create(Family family) {
        return repository.save(family);
    }
}
