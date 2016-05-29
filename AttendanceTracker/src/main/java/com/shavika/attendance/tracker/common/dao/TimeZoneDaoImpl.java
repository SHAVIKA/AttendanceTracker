package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shavika.attendance.tracker.api.dao.BaseDaoImpl;
import com.shavika.attendance.tracker.api.dto.TimeZone;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

@Repository("timeZoneDao")
public class TimeZoneDaoImpl extends BaseDaoImpl<TimeZone>implements TimeZoneDao {

	@Override
	public List<TimeZone> getAllTimeZone() throws ShavikaAppException {
		return (List<TimeZone>) findAll(TimeZone.class);
	}

}
