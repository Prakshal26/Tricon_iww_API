package com.worldwhoswho.whoswho.services;

import java.util.List;

public interface CrudService<T,ID> {

    List<T> findAll();
    T save(T obj);

    void deleteById(ID id);

}
