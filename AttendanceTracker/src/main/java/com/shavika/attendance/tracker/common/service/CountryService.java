package com.shavika.attendance.tracker.common.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.Country;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface CountryService {

	public abstract List<Country> getAllCountry() throws ShavikaAppException;

}
