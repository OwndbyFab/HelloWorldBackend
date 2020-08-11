package de.ilume.HelloWorldBackend.service;

import de.ilume.HelloWorldBackend.dao.FurnitureDao;
import de.ilume.HelloWorldBackend.model.Furniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class FurnitureServiceImpl implements FurnitureService {

    @Autowired
    FurnitureDao furnitureDao;


    @Override
    public List<Furniture> findAll() {
        return furnitureDao.findAll();
    }
}
