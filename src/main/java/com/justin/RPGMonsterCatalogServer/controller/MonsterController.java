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
        List<Monster> list = service.readAll();
        if(list != null && !list.isEmpty()) return new ResponseEntity<>(list, HttpStatus.OK);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monster> getById(@PathVariable Long id){
        Monster monster = service.readById(id);
        if(monster != null) return new ResponseEntity<>(monster, HttpStatus.OK);
        return ResponseEntity.badRequest().build();
    }
    @GetMapping("/family/{id}")
    public ResponseEntity<List<Monster>> getByFamilyId(@PathVariable Long id) {
        List<Monster> ls = service.readAllByFamilyId(id);
        return ls != null ? new ResponseEntity<>(ls, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<Monster> post(@RequestBody Monster monster){
        Monster created = service.create(monster);
        if(created != null) return new ResponseEntity<>(created, HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Monster> put(@PathVariable Long id, @RequestBody Monster monster){
        Monster updated = service.update(id, monster);
        if(updated != null) return new ResponseEntity<>(updated, HttpStatus.OK);
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity delete(@PathVariable Long id){
        if(service.delete(id)) return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }

}
