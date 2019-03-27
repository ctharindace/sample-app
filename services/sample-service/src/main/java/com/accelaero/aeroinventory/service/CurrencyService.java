package com.accelaero.aeroinventory.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.dao.postgre.hibenate.CurrencyDAO;
import com.accelaero.aeroinventory.dao.postgre.hibenate.CurrencyExchangeRateDAO;
import com.accelaero.aeroinventory.model.rdbms.Currency;
import com.accelaero.aeroinventory.model.rdbms.CurrencyExchangeRate;

@Component
public class CurrencyService {
	
	@Autowired
	private CurrencyDAO currencyDAO;
	
	@Autowired
	private CurrencyExchangeRateDAO currencyExchangeRateDAO;
	
	public BigDecimal convertedAmount(String fromCurrencyCode, String toCurrencyCode, BigDecimal amount) {
		CurrencyExchangeRate fromRate = currencyExchangeRateDAO.getCurrencyExchangeRate(fromCurrencyCode);
		CurrencyExchangeRate toRate = currencyExchangeRateDAO.getCurrencyExchangeRate(toCurrencyCode);
		return fromRate.getExRateToBase().multiply(toRate.getExRateFromBase()).multiply(amount);
	}
	
	public CurrencyExchangeRate getExchangeRate(String fromCurrencyCode) {
		CurrencyExchangeRate fromRate = currencyExchangeRateDAO.getCurrencyExchangeRate(fromCurrencyCode);
		return fromRate;
	}
	
	public void saveCurrency(Currency currency) {
		currencyDAO.save(currency);
	}
	
	public void saveCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
		currencyExchangeRateDAO.save(currencyExchangeRate);
	}

}
