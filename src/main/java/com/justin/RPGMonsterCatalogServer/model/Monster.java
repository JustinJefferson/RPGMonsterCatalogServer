package com.justin.RPGMonsterCatalogServer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Monster {

    @Id
    private Long id;

    private String name;
    private String description;

    private Integer hp;
    private Integer sp;
    private Integer atk;
    private Integer def;
    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;

    private String[] weaknesses;

    private Monster preEvolution;
    private List<Monster> Evolutions;

    private List<Skill> skills;

    public Monster(Long id, String name, String description, Integer hp, Integer sp,
                   Integer atk, Integer def, Integer strength, Integer dexterity,
                   Integer intelligence, Integer agility, Integer luck, String[] weaknesses,
                   Monster preEvolution, List<Monster> evolutions, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hp = hp;
        this.sp = sp;
        this.atk = atk;
        this.def = def;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.agility = agility;
        this.luck = luck;
        this.weaknesses = weaknesses;
        this.preEvolution = preEvolution;
        Evolutions = evolutions;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public String[] getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String[] weaknesses) {
        this.weaknesses = weaknesses;
    }

    public Monster getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(Monster preEvolution) {
        this.preEvolution = preEvolution;
    }

    public List<Monster> getEvolutions() {
        return Evolutions;
    }

    public void setEvolutions(List<Monster> evolutions) {
        Evolutions = evolutions;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
