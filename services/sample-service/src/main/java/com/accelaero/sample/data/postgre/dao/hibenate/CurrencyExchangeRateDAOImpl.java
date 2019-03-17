package com.accelaero.sample.data.postgre.dao.hibenate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

@Component
public class CurrencyExchangeRateDAOImpl extends BaseHibernateDAO<CurrencyExchangeRate> implements CurrencyExchangeRateDAO{
	
	public CurrencyExchangeRate getCurrencyExchangeRate(String currencyCode) {
		Session currentSession = getSession();
		Transaction transObj = currentSession.beginTransaction();
		String hql = "from CurrencyExchangeRate cer where cer.currencyCode=:currencyCode and cer.status='ACT' "
				+ "and :date between cer.effectiveFrom and cer.effectiveTo";

		Query<CurrencyExchangeRate> query = currentSession.createQuery(hql).setParameter("currencyCode", currencyCode)
				.setParameter("date", new Date());

		List<CurrencyExchangeRate> list = query.list();
		transObj.commit();
		
		if(list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
