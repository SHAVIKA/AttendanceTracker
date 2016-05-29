package com.shavika.attendance.tracker.common.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dao.BaseDao;
import com.shavika.attendance.tracker.api.dto.TimeZone;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface TimeZoneDao extends BaseDao<TimeZone> {

	public abstract List<TimeZone> getAllTimeZone() throws ShavikaAppException;

}
