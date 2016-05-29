package com.shavika.attendance.tracker.common.service;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.TimeZone;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public interface TimeZoneService {

	public abstract List<TimeZone> getTimeZone() throws ShavikaAppException;

}
