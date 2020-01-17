package com.justin.RPGMonsterCatalogServer.repository;

import com.justin.RPGMonsterCatalogServer.key.ElementEffectivenessKey;
import com.justin.RPGMonsterCatalogServer.model.ElementEffectiveness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementEffectivenessRepository extends JpaRepository<ElementEffectiveness, ElementEffectivenessKey> {
}
