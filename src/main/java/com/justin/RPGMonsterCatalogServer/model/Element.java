package com.justin.RPGMonsterCatalogServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long elementId;
    private String elementName;

    public Element() {}

    public Element(Long elementId, String name) {
        this.elementId = elementId;
        this.elementName = name;
    }

    public Long getElementId() {
        return elementId;
    }

    public void setElementId(Long elementId) {
        this.elementId = elementId;
    }

    public String getName() {
        return elementName;
    }

    public void setName(String name) {
        this.elementName = name;
    }

    public Element update(Element element) {
        this.elementName = element.elementName;
        return this;
    }
}
