package com.accelaero.sample.data.postgre.dao.hibenate;

public interface BaseDaoSupport<T> {

    public T save(T t);

    public T get(Class<T> t, Long id);

    public void delete(T t);
    
    public void merge(T t);
}

