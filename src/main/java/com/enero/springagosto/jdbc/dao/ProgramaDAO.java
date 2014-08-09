package com.enero.springagosto.jdbc.dao;

import com.enero.springagosto.jdbc.model.Programa;
import java.util.List;

public interface ProgramaDAO {
    List<Programa> all();
    Programa find(long  id);
    void save(Programa programa);
    void update(Programa programa);
    void delele(Programa programa);
    Programa find(String  nombre);
    Programa findbyArea(Programa programa);
}
