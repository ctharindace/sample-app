package com.accelaero.sample.data.postgre.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;

@Repository
public interface CurrencyExchangeRateRepository extends JpaRepository<CurrencyExchangeRate, Long> {
	
	@Query("SELECT cer FROM CurrencyExchangeRate cer WHERE cer.currencyCode=?1")
	CurrencyExchangeRate getExchangeRate(String fromCurrencyCode);
}
