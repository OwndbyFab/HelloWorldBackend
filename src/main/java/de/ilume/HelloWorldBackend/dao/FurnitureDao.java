package de.ilume.HelloWorldBackend.dao;

import de.ilume.HelloWorldBackend.model.Furniture;

import java.util.List;

public interface FurnitureDao {
    List<Furniture> findAll();
}
