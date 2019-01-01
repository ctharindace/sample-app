package com.accelaero.sample.data.postgre.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.accelaero.sample.model.rdbms.Currency;

@Component
public class CurrencyDAO {

	public Currency getCurrencyByCode(String currencyCode) {
		return null;
	}
	
	public void saveCurrency() {
		//TODO
	}
	
	public BigDecimal getRelativeExchangeRate(String fromCurrencyCode, String toCurrencyCode) {
		//TODO
		return new BigDecimal(0.0);
	}
	
}
