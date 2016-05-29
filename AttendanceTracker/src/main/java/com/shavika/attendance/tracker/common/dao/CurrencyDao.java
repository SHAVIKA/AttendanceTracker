package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Currency;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface CurrencyDao extends BaseDao<Currency> {

	public abstract List<Currency> getAllCurrency() throws ShavikaAppException;
}
