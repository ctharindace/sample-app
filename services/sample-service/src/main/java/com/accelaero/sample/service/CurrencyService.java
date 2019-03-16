package com.accelaero.sample.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.sample.data.postgre.dao.CurrencyExchangeRateRepository;
import com.accelaero.sample.data.postgre.dao.CurrencyRepository;
import com.accelaero.sample.model.rdbms.Currency;
import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

@Component
public class CurrencyService {
	
	@Autowired
	private CurrencyExchangeRateRepository currencyExchangeRateRepository;
	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	public BigDecimal convertedAmount(String fromCurrencyCode, String toCurrencyCode, BigDecimal amount) {
		CurrencyExchangeRate fromRate = currencyExchangeRateRepository.getExchangeRate(fromCurrencyCode);
		CurrencyExchangeRate toRate = currencyExchangeRateRepository.getExchangeRate(toCurrencyCode);
		return new BigDecimal("0.0");
	}
	
	public CurrencyExchangeRate getExchangeRate(String fromCurrencyCode) {
		CurrencyExchangeRate fromRate = currencyExchangeRateRepository.getExchangeRate(fromCurrencyCode);
		return fromRate;
	}
	
	public void saveCurrency(Currency currency) {
		currencyRepository.save(currency);
	}
	
	public void saveCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
		currencyExchangeRateRepository.save(currencyExchangeRate);
	}

}
