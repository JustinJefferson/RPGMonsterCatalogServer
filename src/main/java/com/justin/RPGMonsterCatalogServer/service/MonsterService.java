package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.repository.MonsterRepository;
import com.justin.RPGMonsterCatalogServer.utils.MonsterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonsterService {

    private MonsterRepository repository;

    @Autowired
    public MonsterService(MonsterRepository repository) {
        this.repository = repository;
    }


    public List<Monster> readAll() {
        return repository.findAll();
    }

    public List<Monster> readAllByFamilyId(Long familyId) {
        return repository.findAllByFamilyId(familyId);
    }


    public Monster readById(Long id) {
        return repository.findById(id).get();
    }

    public Monster create(Monster monster) {
        return repository.save(monster);
    }

    public Monster update(Long id, Monster monster) {
        Monster original = readById(id);
        return repository.save(new MonsterBuilder(original).replicate(monster).build());
    }

    public Boolean delete(Long id) {
        repository.delete(readById(id));
        return readById(id) == null;
    }
}
