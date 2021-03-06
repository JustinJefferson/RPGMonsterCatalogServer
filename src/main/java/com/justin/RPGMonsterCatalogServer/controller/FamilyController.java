package com.justin.RPGMonsterCatalogServer.controller;

import com.justin.RPGMonsterCatalogServer.model.Family;
import com.justin.RPGMonsterCatalogServer.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/family")
@CrossOrigin(origins = "http://localhost:4200")
public class FamilyController {

    @Autowired
    private FamilyService service;

    @PostMapping
    public ResponseEntity<Family> post(@RequestBody Family family) {
        Family result = service.create(family);
        return result != null ? new ResponseEntity<>(result, HttpStatus.CREATED) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Family> put(@PathVariable Long id, @RequestBody Family family) {
        Family result = service.update(id, family);
        return result != null ? new ResponseEntity<>(result, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Boolean result = service.delete(id);
        return result != null ? new ResponseEntity<>(result, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @GetMapping
    public ResponseEntity<List<Family>> getAll() {
        List<Family> ls = service.readAll();
        return ls != null ? new ResponseEntity<>(ls, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Family> get(@PathVariable Long id) {
        Family family = service.readById(id);
        return family != null ? new ResponseEntity<>(family, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }




}
