package com.justin.RPGMonsterCatalogServer.utils;

import com.justin.RPGMonsterCatalogServer.model.Monster;
import com.justin.RPGMonsterCatalogServer.model.Skill;

import java.util.HashSet;
import java.util.Set;

public class MonsterBuilder {

    private Monster monster;

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

    private Set<Skill> skills;

    public MonsterBuilder() {
        monsterId = null;
        monsterName = "";
        description = "";
        familyId = null;
        hp = 100;
        sp = 100;
        atk = 10;
        def = 10;
        strength = 10;
        dexterity = 10;
        intelligence = 10;
        agility = 10;
        luck = 10;
        preEvolutionId = null;
        skills = new HashSet<>();
    }

    public MonsterBuilder(Monster monster){
        monsterId = monster.getMonsterId();
        monsterName = monster.getMonsterName();
        description = monster.getDescription();
        familyId = monster.getFamilyId();
        hp = monster.getHp();
        sp = monster.getSp();
        atk = monster.getAtk();
        def = monster.getDef();
        strength = monster.getStrength();
        dexterity = monster.getDexterity();
        intelligence = monster.getIntelligence();
        agility = monster.getAgility();
        luck = monster.getLuck();
        preEvolutionId = monster.getPreEvolutionId();
        skills = monster.getSkills();
    }

    public Monster build(){
        return new Monster(monsterId, monsterName, description, familyId, hp, sp,
                atk, def, strength, dexterity, intelligence, agility,
                luck, preEvolutionId, skills);
    }

    /**
     * Copies the fields of a monster using a Monster. This replaces all fields except the id.
     * @param monster the Monster whose fields are to be copied.
     * @return returns self
     */
    public MonsterBuilder replicate(Monster monster){
        monsterId = monster.getMonsterId();
        monsterName = monster.getMonsterName();
        description = monster.getDescription();
        familyId = monster.getFamilyId();
        hp = monster.getHp();
        sp = monster.getSp();
        atk = monster.getAtk();
        def = monster.getDef();
        strength = monster.getStrength();
        dexterity = monster.getDexterity();
        intelligence = monster.getIntelligence();
        agility = monster.getAgility();
        luck = monster.getLuck();
        preEvolutionId = monster.getPreEvolutionId();

        skills = monster.getSkills();
        return this;
    }


}
