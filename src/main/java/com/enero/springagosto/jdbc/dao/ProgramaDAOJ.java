package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

    public List<Programa> all() {
        String query = "SELECT * FROM programa";
        return this.getJdbcTemplate().query(query, new ProgramaRowMapper());
    }

    public Programa find(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void update(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delele(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Programa find(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Programa findbyArea(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
