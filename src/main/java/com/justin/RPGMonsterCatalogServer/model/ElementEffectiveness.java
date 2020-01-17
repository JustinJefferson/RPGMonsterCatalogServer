package com.justin.RPGMonsterCatalogServer.model;

import com.justin.RPGMonsterCatalogServer.key.ElementEffectivenessKey;

import javax.persistence.*;

@Entity
public class ElementEffectiveness {

    @EmbeddedId
    private ElementEffectivenessKey id;

    @ManyToOne
    @MapsId("family_id")
    @JoinColumn(name = "family_id")
    private Family family;

    @ManyToOne
    @MapsId("element_id")
    @JoinColumn(name = "element_id")
    private Element element;

    private String rating;

    public ElementEffectiveness() {}
    public ElementEffectiveness(ElementEffectivenessKey id, Family family, Element element, String rating) {
        this.id = id;
        this.family = family;
        this.element = element;
        this.rating = rating;
    }

    public ElementEffectivenessKey getId() {
        return id;
    }

    public void setId(ElementEffectivenessKey id) {
        this.id = id;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
