package com.justin.RPGMonsterCatalogServer.repository;

import com.justin.RPGMonsterCatalogServer.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {
}
