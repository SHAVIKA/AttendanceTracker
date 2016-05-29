package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.Country;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("countryDao")
public class CountryDaoImpl extends BaseDaoImpl<Country>implements CountryDao {

	@Override
	public List<Country> getAllCountry() throws ShavikaAppException {
		return (List<Country>) findAll(Country.class);
	}
}
