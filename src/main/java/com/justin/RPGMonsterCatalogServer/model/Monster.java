package com.justin.RPGMonsterCatalogServer.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long monsterId;

    private String monsterName;
    private String description;
    private Long familyId;

    private Integer hp;
    private Integer sp;
    private Integer atk;
    private Integer def;
    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;

    private Long preEvolutionId;

    @ManyToMany
    @JoinTable(
            name = "monster_skill",
            joinColumns = @JoinColumn(name = "monsterId"),
            inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private Set<Skill> skills;

    public Monster(){}

    public Monster(Long monsterId, String monsterName, String description, Long familyId, Integer hp, Integer sp,
                   Integer atk, Integer def, Integer strength, Integer dexterity,
                   Integer intelligence, Integer agility, Integer luck,
                   Long preEvolutionId, Set<Skill> skills) {
        this.monsterId = monsterId;
        this.monsterName = monsterName;
        this.description = description;
        this.familyId = familyId;
        this.hp = hp;
        this.sp = sp;
        this.atk = atk;
        this.def = def;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.agility = agility;
        this.luck = luck;
        this.preEvolutionId = preEvolutionId;
        this.skills = skills;
    }

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
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

    public Long getPreEvolutionId() {
        return preEvolutionId;
    }

    public void setPreEvolutionId(Long preEvolutionId) {
        this.preEvolutionId = preEvolutionId;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }
}
