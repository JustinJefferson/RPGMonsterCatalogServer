package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.controller.FamilyController;
import com.justin.RPGMonsterCatalogServer.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {
    private FamilyRepository repository;

    @Autowired
    public FamilyService(FamilyRepository repository) {
        this.repository = repository;
    }
}
