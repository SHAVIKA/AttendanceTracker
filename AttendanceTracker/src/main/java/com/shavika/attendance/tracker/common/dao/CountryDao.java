package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.Country;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface CountryDao extends BaseDao<Country> {

	public abstract List<Country> getAllCountry() throws ShavikaAppException;
}
