package com.justin.RPGMonsterCatalogServer.controller;

import com.justin.RPGMonsterCatalogServer.model.Element;
import com.justin.RPGMonsterCatalogServer.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/element")
public class ElementController {

    @Autowired
    private ElementService service;

    @GetMapping
    public ResponseEntity<List<Element>> getAll() {
        List<Element> ls = service.readAll();
        return ls != null ? new ResponseEntity<>(ls, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Element> get(@PathVariable Long id) {
        Element el = service.readById(id);
        return el != null ? new ResponseEntity<>(el, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<Element> post(@RequestBody Element element) {
        Element el = service.create(element);
        return el != null ? new ResponseEntity<>(el, HttpStatus.CREATED) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Element> put(@PathVariable Long id, @RequestBody Element element) {
        Element el = service.update(id, element);
        return el != null ? new ResponseEntity<>(el, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@RequestBody Long id) {
        Boolean bool = service.delete(id);
        return bool != null ? new ResponseEntity<>(bool, HttpStatus.OK) : ResponseEntity.badRequest().build();
    }

}
