package de.ilume.HelloWorldBackend.controller;

import de.ilume.HelloWorldBackend.model.Furniture;
import de.ilume.HelloWorldBackend.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    FurnitureService furnitureService;

    @GetMapping("")
    public String helloWorld() {
        return "Hello World .";
    }

    @GetMapping(value = "/furniture")
    public List<Furniture> getFurniture() {

        return furnitureService.findAll();
    }
}
