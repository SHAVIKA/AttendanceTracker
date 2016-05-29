package com.shavika.attendance.tracker.common.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.Currency;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface CurrencyService {

	public abstract List<Currency> getAllCurrency() throws ShavikaAppException;

}
