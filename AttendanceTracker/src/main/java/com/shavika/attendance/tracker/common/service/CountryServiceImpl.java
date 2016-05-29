package com.shavika.attendance.tracker.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.Country;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.dao.CountryDao;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryDao countryDao;

	@Override
	public List<Country> getAllCountry() throws ShavikaAppException {
		return countryDao.getAllCountry();
	}

}
