package com.shavika.attendance.tracker.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shavika.attendance.tracker.api.dto.TimeZone;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.dao.TimeZoneDao;

@Service("timeZoneService")
public class TimeZoneServiceImpl implements TimeZoneService {

	@Autowired
	TimeZoneDao timeZoneDao;

	@Override
	public List<TimeZone> getTimeZone() throws ShavikaAppException {
		return timeZoneDao.getAllTimeZone();
	}

}
