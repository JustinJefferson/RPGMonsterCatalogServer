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

    @GetMapping
    public ResponseEntity<List<Family>> getAll() {
        List<Family> ls = service.readAll();
        if(ls != null) {
            return new ResponseEntity<>(ls, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Family> get(@PathVariable Long id) {
        Family family = service.readById(id);
        if(family != null) {
            return new ResponseEntity<>(family, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }


}
