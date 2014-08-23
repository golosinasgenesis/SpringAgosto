package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

    public List<Programa> all() {
        String query = "SELECT * FROM programa";
        return this.getJdbcTemplate().query(query, new ProgramaRowMapper());
    }

    public Programa find(long id) {
        String sql = "SELECT * FROM programa WHERE id = ?";
        Programa programa = (Programa) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{id}, new ProgramaRowMapper());
        return programa;
    }

    public void save(Programa programa) {
        String sql = "INSERT INTO programa (nombre,descripcion,codigo) VALUES (?,?,?)";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                programa.getNombre(),
                programa.getDescripcion(),
                programa.getCodigo()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        } 
    }

    public void update(Programa programa) {
        String sql = "UPDATE programa SET nombre=?, descripcion=?, codigo=? WHERE id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                programa.getNombre(),
                programa.getDescripcion(),
                programa.getCodigo(),
                programa.getId()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void delete(Programa programa) {
        String sql = "DELETE FROM programa WHERE id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{programa.getId()});
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public Programa find(String codigo) {
        String sql = "SELECT * FROM programa WHERE codigo = ?";
        Programa programa = (Programa) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{codigo}, new ProgramaRowMapper());
        return programa;
    }

    public Programa findbyArea(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
