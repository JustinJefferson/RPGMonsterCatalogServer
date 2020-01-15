package com.justin.RPGMonsterCatalogServer.service;

import com.justin.RPGMonsterCatalogServer.model.Element;
import com.justin.RPGMonsterCatalogServer.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementService {

    private ElementRepository repository;

    @Autowired

    public ElementService(ElementRepository repository) {
        this.repository = repository;
    }

    public List<Element> readAll() {
        return repository.findAll();
    }

    public Element readById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Element create(Element element) {
        return repository.save(element);
    }

    public Element update(Long id, Element element) {
        Element el = readById(id);
        return el != null ? repository.save(el.update(element)) : null;
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return readById(id) == null;
    }
}
