package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Programa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProgramaRowMapper implements RowMapper<Programa> {

    public Programa mapRow(ResultSet rs, int rowNum) throws SQLException {
        Programa programa = new Programa();
        programa.setId(rs.getLong(0));
        programa.setNombre(rs.getString(1));
        programa.setDescripcion(rs.getString(2));
        return programa;
    }
}
