package com.accelaero.sample.data.postgre.dao.hibenate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.accelaero.sample.framework.hibernate.HibernateFrameworkSupport;

public abstract class BaseHibernateDAO<T> extends HibernateFrameworkSupport
		implements BaseDaoSupport<T> {

	public T save(T t) {
		Session session = null;
		session = getSession();
		// Creating Transaction Object
		Transaction transObj = session.beginTransaction();
		session.save(t);
		// Transaction Is Committed To Database
		transObj.commit();

		return t;
	}

	public T get(Class<T> t, Long id) {
		Session session = null;
		session = getSession();
		// Creating Transaction Object
		Transaction transObj = session.beginTransaction();
		T t1 = session.get(t, id);

		transObj.commit();

		return t.cast(t1);
	}

	public void delete(T t) {
		Session session = null;
		session = getSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
	}
	
	public void merge(T t) {
		Session session = getSession();
		session.beginTransaction();
		session.merge(t);
		session.getTransaction().commit();
	}
	
	protected Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	
}