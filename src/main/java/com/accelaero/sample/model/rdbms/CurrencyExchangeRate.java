package com.accelaero.sample.model.rdbms;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencyExchangeRate {
	
	private Integer currencyExchangeRateId;
	
	private String currencyCode;
	
	private Date effectiveFrom;
	
	private Date effectiveTo;
	
	private BigDecimal exRateFromBase;
	
	private BigDecimal exRateToBase;
	
	private String status;

	public Integer getCurrencyExchangeRateId() {
		return currencyExchangeRateId;
	}

	public void setCurrencyExchangeRateId(Integer currencyExchangeRateId) {
		this.currencyExchangeRateId = currencyExchangeRateId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public BigDecimal getExRateFromBase() {
		return exRateFromBase;
	}

	public void setExRateFromBase(BigDecimal exRateFromBase) {
		this.exRateFromBase = exRateFromBase;
	}

	public BigDecimal getExRateToBase() {
		return exRateToBase;
	}

	public void setExRateToBase(BigDecimal exRateToBase) {
		this.exRateToBase = exRateToBase;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
