package com.accelaero.aeroinventory.model.rdbms;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "CURRENCY")
public class Currency {

	@Id
	@Column(name = "CURRENCY_CODE")
	private String currencyCode;

	@Column(name = "CURRENCY_NAME")
	private String currencyName;
	
	@Column(name = "STATUS")
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity=CurrencyExchangeRate.class)
	@JoinColumn(name = "CURRENCY_CODE")
	private Set<CurrencyExchangeRate> currencyExchangeRates;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<CurrencyExchangeRate> getCurrencyExchangeRates() {
		return currencyExchangeRates;
	}

	public void setCurrencyExchangeRates(Set<CurrencyExchangeRate> currencyExchangeRates) {
		this.currencyExchangeRates = currencyExchangeRates;
	}
	
}
