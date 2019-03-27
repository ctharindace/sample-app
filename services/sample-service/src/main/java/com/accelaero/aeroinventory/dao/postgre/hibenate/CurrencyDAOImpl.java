package com.accelaero.aeroinventory.dao.postgre.hibenate;

import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.model.rdbms.Currency;

@Component
public class CurrencyDAOImpl extends BaseHibernateDAO<Currency> implements CurrencyDAO{

}
