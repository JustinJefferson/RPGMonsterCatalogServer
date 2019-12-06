package com.justin.RPGMonsterCatalogServer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Skill {

    @Id
    private Long Id;

    private String name;
    private String stat;
    private String element;
    private Integer power;
    private Integer cost;
    private String Description;

    public Skill(Long id, String name, String stat, String element, Integer power, Integer cost, String description) {
        Id = id;
        this.name = name;
        this.stat = stat;
        this.element = element;
        this.power = power;
        this.cost = cost;
        Description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
