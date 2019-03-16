package com.accelaero.sample.data.postgre.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accelaero.sample.model.rdbms.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
