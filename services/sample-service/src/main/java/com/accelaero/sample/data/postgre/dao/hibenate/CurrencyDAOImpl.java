package com.accelaero.sample.data.postgre.dao.hibenate;

import org.springframework.stereotype.Component;

import com.accelaero.sample.model.rdbms.Currency;

@Component
public class CurrencyDAOImpl extends BaseHibernateDAO<Currency> implements CurrencyDAO{

}
