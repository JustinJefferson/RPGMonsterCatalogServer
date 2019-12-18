package com.justin.RPGMonsterCatalogServer.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Family {

    private String name;
    private List<Element> weaknesses;
}
