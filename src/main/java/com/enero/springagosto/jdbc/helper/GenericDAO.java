package com.enero.springagosto.jdbc.helper;

import java.util.List;

public interface GenericDAO<T> {
    
    List<T> all();
    T find(long  id);
    void save(T t);
    void update(T t);
    void delete(T t);
    
}