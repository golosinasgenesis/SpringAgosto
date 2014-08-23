package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.helper.GenericDAO;
import com.enero.springagosto.jdbc.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa>{
    
    Programa find(String  codigo);
}