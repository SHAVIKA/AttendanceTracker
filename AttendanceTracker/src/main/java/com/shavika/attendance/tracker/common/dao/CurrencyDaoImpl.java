package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.Currency;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("currencyDao")
public class CurrencyDaoImpl extends BaseDaoImpl<Currency>implements CurrencyDao {

	@Override
	public List<Currency> getAllCurrency() throws ShavikaAppException {
		return (List<Currency>) findAll(Currency.class);
	}

}
