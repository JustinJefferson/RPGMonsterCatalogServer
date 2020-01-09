package com.justin.RPGMonsterCatalogServer.repository;

import com.justin.RPGMonsterCatalogServer.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long> {
}
