package com.justin.RPGMonsterCatalogServer.repository;

import com.justin.RPGMonsterCatalogServer.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
