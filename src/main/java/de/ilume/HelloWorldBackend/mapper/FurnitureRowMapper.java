package de.ilume.HelloWorldBackend.mapper;

import de.ilume.HelloWorldBackend.model.Furniture;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FurnitureRowMapper implements RowMapper<Furniture> {

    @Override
    public Furniture mapRow(ResultSet rs, int arg1) throws SQLException {
        Furniture furniture = new Furniture();
        furniture.setFurnitureId(rs.getInt("furnitureId"));
        furniture.setFurnitureName(rs.getString("furnitureName"));

        return furniture;
    }
}
