package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Curso;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CursoDAOJ extends JdbcDaoSupport implements CursoDAO{

    public Curso find(String codigo) {
        String sql = "SELECT * FROM curso WHERE codigo = ?";
        Curso curso = (Curso) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{codigo}, new CursoRowMapper());
        return curso;
    }

    public List<Curso> all() {
        String query = "SELECT * FROM curso";
        return this.getJdbcTemplate().query(query, new CursoRowMapper());
    }

    public Curso find(long id) {
        String sql = "SELECT * FROM curso WHERE id = ?";
        Curso curso = (Curso) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{id}, new CursoRowMapper());
        return curso;
    }

    public void save(Curso t) {
        String sql = "INSERT INTO curso (nombre,codigo,fecha_inicio,id_programa) VALUES (?,?,?,?)";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                t.getNombre(),
                t.getCodigo(),
                t.getFechainicio(),
                t.getIdprograma()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void update(Curso t) {
        String sql = "UPDATE curso SET nombre=?, codigo=?, fecha_inicio=?, id_programa=? WHERE id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                t.getNombre(),
                t.getCodigo(),
                t.getFechainicio(),
                t.getIdprograma(),
                t.getId()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void delete(Curso t) {
        String sql = "DELETE FROM curso WHERE id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{t.getId()});
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
}
