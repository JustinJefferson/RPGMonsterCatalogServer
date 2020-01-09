package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.controller.ElementController;
import com.justin.RPGMonsterCatalogServer.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementService {

    private ElementRepository repository;

    @Autowired

    public ElementService(ElementRepository repository) {
        this.repository = repository;
    }
}
