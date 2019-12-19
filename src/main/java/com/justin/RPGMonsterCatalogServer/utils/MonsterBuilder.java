package com.justin.RPGMonsterCatalogServer.utils;

import com.justin.RPGMonsterCatalogServer.model.Family;
import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.model.Skill;

import java.util.List;

public class MonsterBuilder {

    private Long id;

    private String name;
    private String description;
    private Family family;

    private Integer hp;
    private Integer sp;
    private Integer atk;
    private Integer def;
    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;

    private Monster preEvolution;
    private List<Monster> evolutions;

    private List<Skill> skills;

    public MonsterBuilder() {
    }

    public MonsterBuilder(Monster monster){
        id = monster.getId();
        name = monster.getName();
        description = monster.getDescription();
        family = monster.getFamily();
        hp = monster.getHp();
        sp = monster.getSp();
        atk = monster.getAtk();
        def = monster.getDef();
        strength = monster.getStrength();
        dexterity = monster.getDexterity();
        intelligence = monster.getIntelligence();
        agility = monster.getAgility();
        luck = monster.getLuck();
        preEvolution = monster.getPreEvolution();
        evolutions = monster.getEvolutions();
        skills = monster.getSkills();
    }

    public Monster build(){
        return new Monster(id, name, description, family, hp, sp,
                atk, def, strength, dexterity, intelligence, agility,
                luck, preEvolution, evolutions, skills);
    }

    /**
     * Copies the fields of a monster using a Monster. This replaces all fields except the id.
     * @param monster the Monster whose fields are to be copied.
     * @return returns self
     */
    public MonsterBuilder update(Monster monster){
        id = monster.getId();
        name = monster.getName();
        description = monster.getDescription();
        family = monster.getFamily();
        hp = monster.getHp();
        sp = monster.getSp();
        atk = monster.getAtk();
        def = monster.getDef();
        strength = monster.getStrength();
        dexterity = monster.getDexterity();
        intelligence = monster.getIntelligence();
        agility = monster.getAgility();
        luck = monster.getLuck();
        preEvolution = monster.getPreEvolution();
        evolutions = monster.getEvolutions();
        skills = monster.getSkills();
        return this;
    }


}
