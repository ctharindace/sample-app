package com.accelaero.sample.model.rdbms;

import java.math.BigDecimal;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BigDecimalConverter implements AttributeConverter<BigDecimal, Long> {

  @Override
  public Long convertToDatabaseColumn(BigDecimal value) {
    if (value == null) {
        return null;
    } else {
        return value.multiply(BigDecimal.valueOf(100)).longValue();
    }
  }

  @Override
  public BigDecimal convertToEntityAttribute(Long value) {
    if (value == null) {
        return null;
    } else {
        return new BigDecimal(value).divide(BigDecimal.valueOf(100));
    }
  }
}
