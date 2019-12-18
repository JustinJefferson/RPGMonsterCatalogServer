package com.justin.RPGMonsterCatalogServer.controller;

import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return service.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monster> getById(@PathVariable Long id){
        Monster monster = service.readById(id);
        if(monster != null) return new ResponseEntity<>(monster, HttpStatus.FOUND);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Monster> post(@RequestBody Monster monster){
        return service.create(monster);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monster> put(@PathVariable Long id, @RequestBody Monster monster){
        return service.update(id, monster);
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id){
        if(service.delete(id)) return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }

}
