package com.accelaero.aeroinventory.dao.postgre.hibenate;

import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.model.rdbms.CurrencyExchangeRate;

@Component
public interface CurrencyExchangeRateDAO extends BaseDAOSupport<CurrencyExchangeRate>{
	
	public CurrencyExchangeRate getCurrencyExchangeRate(String currencyCode);

}
