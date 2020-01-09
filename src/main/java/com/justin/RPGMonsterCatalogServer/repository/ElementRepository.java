package com.justin.RPGMonsterCatalogServer.repository;

import com.justin.RPGMonsterCatalogServer.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element, Long> {
}
