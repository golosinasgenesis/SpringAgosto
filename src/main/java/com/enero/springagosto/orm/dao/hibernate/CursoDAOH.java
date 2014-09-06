package com.enero.springagosto.orm.dao.hibernate;

import com.enero.springagosto.orm.dao.BaseHibernateDAO;
import com.enero.springagosto.orm.dao.CursoDAO;
import com.enero.springagosto.orm.model.Curso;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("cursoDAO")
public class CursoDAOH extends BaseHibernateDAO implements CursoDAO{

    public List<Curso> all() {
        Criteria criteria = this.getSession().createCriteria(Curso.class);
        return criteria.list();
    }

    public Curso find(long id) {
        Criteria criteria= this.getSession().createCriteria(Curso.class);
        criteria.add(Restrictions.eq("id", id));
        return (Curso) criteria.uniqueResult();
    }

    public void save(Curso t) {
        this.getSession().save(t);
    }

    public void update(Curso t) {
        this.getSession().update(t);
    }

    public void delete(Curso t) {
        this.getSession().delete(t);
    }
    
    public Curso find(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
