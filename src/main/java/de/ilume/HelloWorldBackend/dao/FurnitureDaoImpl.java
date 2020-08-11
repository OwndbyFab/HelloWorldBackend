package de.ilume.HelloWorldBackend.dao;

import de.ilume.HelloWorldBackend.mapper.FurnitureRowMapper;
import de.ilume.HelloWorldBackend.model.Furniture;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FurnitureDaoImpl implements FurnitureDao {

    NamedParameterJdbcTemplate template;

    public FurnitureDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Furniture> findAll() {
        return template.query("select * from furniture", new FurnitureRowMapper());
    }
}
