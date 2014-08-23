package com.enero.springagosto.orm.dao.hibernate;

import com.enero.springagosto.orm.dao.BaseHibernateDAO;
import com.enero.springagosto.orm.dao.ProgramaDAO;
import com.enero.springagosto.orm.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

//@Transactional
@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO{

    public List<Programa> all() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    public Programa find(long id) {
        Criteria criteria= this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", id));
        return (Programa) criteria.uniqueResult();
    }

    public void save(Programa t) {
        this.getSession().save(t);
    }

    public void update(Programa t) {
        this.getSession().update(t);
    }

    public void delete(Programa t) {
        this.getSession().delete(t);
    }

}