package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Curso;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CursoRowMapper implements RowMapper<Curso>{

    public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {
        Curso curso = new Curso();
        curso.setId(rs.getLong(1));
        curso.setNombre(rs.getString(2));
        curso.setCodigo(rs.getString(3));
        curso.setFechainicio(rs.getString(4));
        curso.setIdprograma(rs.getLong(5));
        return curso;
    }
    
}
