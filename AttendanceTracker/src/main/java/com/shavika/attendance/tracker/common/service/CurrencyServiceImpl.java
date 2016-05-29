package com.shavika.attendance.tracker.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.Currency;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.dao.CurrencyDao;

@Service("currencyService")
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	CurrencyDao currencyDao;

	@Override
	public List<Currency> getAllCurrency() throws ShavikaAppException {
		return currencyDao.getAllCurrency();
	}
}
