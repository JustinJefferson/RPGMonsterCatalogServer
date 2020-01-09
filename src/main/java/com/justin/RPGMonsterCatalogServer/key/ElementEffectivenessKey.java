package com.justin.RPGMonsterCatalogServer.key;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class ElementEffectivenessKey implements Serializable {

    @Column(name = "family_id")
    private Long familyId;

    @Column(name = "element_id")
    private Long elementId;

    public ElementEffectivenessKey() {}

    public ElementEffectivenessKey(Long familyId, Long elementId) {
        this.familyId = familyId;
        this.elementId = elementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementEffectivenessKey that = (ElementEffectivenessKey) o;
        return familyId.equals(that.familyId) &&
                elementId.equals(that.elementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyId, elementId);
    }
}
