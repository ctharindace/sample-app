package com.accelaero.sample.framework.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.accelaero.sample.model.rdbms.Currency;
import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

public class HibernateFrameworkSupport {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if(sessionFactory == null) {
			Configuration configObj = new Configuration();
			configObj.configure("hibernate.cfg.xml");

			configObj.addAnnotatedClass(Currency.class);
			configObj.addAnnotatedClass(CurrencyExchangeRate.class);

			configObj.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
			configObj.setProperty("hibernate.current_session_context_class", "thread");

			ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

			sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);
		}
		return sessionFactory;
	}

}
