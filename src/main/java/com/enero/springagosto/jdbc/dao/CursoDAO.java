package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.helper.GenericDAO;
import com.enero.springagosto.jdbc.model.Curso;

public interface CursoDAO extends GenericDAO<Curso>{
    Curso find(String codigo);
}
