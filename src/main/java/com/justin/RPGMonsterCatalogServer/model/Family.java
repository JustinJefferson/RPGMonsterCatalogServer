package com.justin.RPGMonsterCatalogServer.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long familyId;

    private String familyName;

    @OneToMany(mappedBy = "family")
    private List<ElementEffectiveness> effectivenesses;

    public Family() {}

    public Family(Long familyId, String familyName, List<ElementEffectiveness> effectivenesses) {
        this.familyId = familyId;
        this.familyName = familyName;
        this.effectivenesses = effectivenesses;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<ElementEffectiveness> getEffectivenesses() {
        return effectivenesses;
    }

    public void setEffectivenesses(List<ElementEffectiveness> effectivenesses) {
        this.effectivenesses = effectivenesses;
    }
}
