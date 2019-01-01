package com.accelaero.sample.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accelaero.sample.data.postgre.dao.CurrencyDAO;

@Component
public class CurrencyService {
	
	@Autowired
	private CurrencyDAO currencyDAO;
	
	public BigDecimal convertedAmount(String fromCurrencyCode, String toCurrencyCode, BigDecimal amount) {
		return amount.multiply(currencyDAO.getRelativeExchangeRate(fromCurrencyCode, toCurrencyCode));
	}

}
