package com.accelaero.aeroinventory.dao.postgre.hibenate;

public interface BaseDAOSupport<T> {

    public T save(T t);

    public T get(Class<T> t, Long id);

    public void delete(T t);
    
    public void merge(T t);
}

