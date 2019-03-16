package com.accelaero.sample.model.rdbms;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable     
@Table(name = "CURRENCY_EXCHANGE_RATE")
public class CurrencyExchangeRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CURRENCY_EXCHANGE_RATE")
	@SequenceGenerator(name = "S_CURRENCY_EXCHANGE_RATE", sequenceName = "S_CURRENCY_EXCHANGE_RATE", allocationSize = 1)
	@Column(name = "EXRATE_ID")
	private Integer currencyExchangeRateId;
	
	@Column(name="CURRENCY_CODE")
	private String currencyCode;
	
	@Column(name="EFFECTIVE_FROM")
	private Date effectiveFrom;
	
	@Column(name="EFFECTIVE_to")
	private Date effectiveTo;
	
	@Convert(converter = BigDecimalConverter.class)
	@Column(name="EXRATE_FROM_BASE", insertable = false, updatable = false)
	private BigDecimal exRateFromBase;
	
	@Convert(converter = BigDecimalConverter.class)
	@Column(name="EXRATE_TO_BASE", insertable = false, updatable = false)
	private BigDecimal exRateToBase;
	
	@Column(name="STATUS")
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
