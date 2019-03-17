package com.accelaero.sample.data.postgre.dao.hibenate;

import org.springframework.stereotype.Component;

import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

@Component
public interface CurrencyExchangeRateDAO extends BaseDaoSupport<CurrencyExchangeRate>{
	
	public CurrencyExchangeRate getCurrencyExchangeRate(String currencyCode);

}
