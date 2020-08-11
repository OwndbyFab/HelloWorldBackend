package de.ilume.HelloWorldBackend.service;

import de.ilume.HelloWorldBackend.model.Furniture;

import java.util.List;

public interface FurnitureService {
    List<Furniture> findAll();
}
