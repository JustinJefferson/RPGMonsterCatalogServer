package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.repository.MonsterRepository;
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


    public ResponseEntity<List<Monster>> readAll() {
        List<Monster> list = repository.findAll();
        if(list != null) return new ResponseEntity<>(list, HttpStatus.FOUND);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);


    }


    public Monster readById(Long id) {
        return repository.findById(id).get();
    }

    public ResponseEntity<Monster> create(Monster monster) {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Monster> update(Long id, Monster monster) {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public Boolean delete(Long id) {
        repository.delete(readById(id));
        return readById(id) == null;
    }
}
