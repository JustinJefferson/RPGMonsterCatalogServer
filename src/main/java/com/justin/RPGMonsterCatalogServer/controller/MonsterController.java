package com.justin.RPGMonsterCatalogServer.controller;

import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.repository.MonsterRepository;
import com.justin.RPGMonsterCatalogServer.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/monster")
public class MonsterController {

    private MonsterService service;

    @Autowired
    public MonsterController(MonsterService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Monster>> getAll(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monster> getById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public ResponseEntity<Monster> post(@RequestBody Monster monster){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monster> put(@PathVariable Long id, @RequestBody Monster monster){
        return null;
    }

    @DeleteMapping("/id")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return null;
    }

}
