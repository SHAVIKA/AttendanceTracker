package com.example.utils;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class JavaTimeZones {

	private static String displayTimeZone(TimeZone tz) {

		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
		// avoid -4:-30 issue
		minutes = Math.abs(minutes);

		String result = "";
		if (hours > 0) {
			result = String.format("('(GMT+%d:%02d) %s', '+%d:%02d' , now(),now() ),", hours, minutes, tz.getID(), hours, minutes);
		} else {
			result = String.format("('(GMT%d:%02d) %s', '%d:%02d' , now(),now() ),", hours, minutes, tz.getID(), hours, minutes);
		}

		return result;

	}

	private static void subString() {
		/* Use only JDK 1.7.0_21+ */
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
		}

		System.out.println("\nTotal TimeZone ID " + ids.length);
	}

	public static void main(String[] args) {
		subString();
	}

}
