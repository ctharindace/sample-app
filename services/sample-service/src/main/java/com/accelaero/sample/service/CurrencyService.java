package com.accelaero.sample.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.sample.data.postgre.dao.hibenate.CurrencyDAO;
import com.accelaero.sample.data.postgre.dao.hibenate.CurrencyExchangeRateDAO;
import com.accelaero.sample.model.rdbms.Currency;
import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

@Component
public class CurrencyService {
	
	@Autowired
	private CurrencyDAO currencyDAO;
	
	@Autowired
	private CurrencyExchangeRateDAO currencyExchangeRateDAO;
	
	public BigDecimal convertedAmount(String fromCurrencyCode, String toCurrencyCode, BigDecimal amount) {
		CurrencyExchangeRate fromRate = currencyExchangeRateDAO.getCurrencyExchangeRate(fromCurrencyCode);
		CurrencyExchangeRate toRate = currencyExchangeRateDAO.getCurrencyExchangeRate(toCurrencyCode);
		return fromRate.getExRateFromBase().divide(toRate.getExRateToBase()).multiply(amount);
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
