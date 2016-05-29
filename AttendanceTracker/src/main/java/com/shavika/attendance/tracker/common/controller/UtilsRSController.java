package com.shavika.attendance.tracker.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shavika.attendance.tracker.api.dto.Country;
import com.shavika.attendance.tracker.api.dto.Currency;
import com.shavika.attendance.tracker.api.dto.OrganizationType;
import com.shavika.attendance.tracker.api.dto.TimeZone;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.common.service.CountryService;
import com.shavika.attendance.tracker.common.service.CurrencyService;
import com.shavika.attendance.tracker.common.service.OrganizationTypeService;
import com.shavika.attendance.tracker.common.service.TimeZoneService;

@RestController
public class UtilsRSController {

	@Autowired
	CountryService countryService;

	@Autowired
	CurrencyService currencyService;

	@Autowired
	OrganizationTypeService organizationTypeService;

	@Autowired
	TimeZoneService timeZoneService;

	/*************
	 * @method Get all Country
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/countryList/", method = RequestMethod.GET)
	public ResponseEntity<List<Country>> allCountryList() throws ShavikaAppException {
		List<Country> countryList = countryService.getAllCountry();
		if (countryList.isEmpty())
			return new ResponseEntity<List<Country>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Country>>(countryList, HttpStatus.OK);
	}

	/*************
	 * @method Get all Currency
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/currencyList/", method = RequestMethod.GET)
	public ResponseEntity<List<Currency>> allCurrencyList() throws ShavikaAppException {
		List<Currency> currencyList = currencyService.getAllCurrency();
		if (currencyList.isEmpty())
			return new ResponseEntity<List<Currency>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Currency>>(currencyList, HttpStatus.OK);
	}

	/*************
	 * @method Get all OrganizationType
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/organizationTypeList/", method = RequestMethod.GET)
	public ResponseEntity<List<OrganizationType>> allOrganizationTypeList() throws ShavikaAppException {
		List<OrganizationType> organizationTypeList = organizationTypeService.getAllOrganizationType();
		if (organizationTypeList.isEmpty())
			return new ResponseEntity<List<OrganizationType>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<OrganizationType>>(organizationTypeList, HttpStatus.OK);
	}

	/*************
	 * @method Get all TimeZone
	 * @return
	 * @throws ShavikaAppException
	 */
	@RequestMapping(value = "/timeZoneList/", method = RequestMethod.GET)
	public ResponseEntity<List<TimeZone>> allTimeZoneList() throws ShavikaAppException {
		List<TimeZone> timeZoneList = timeZoneService.getTimeZone();
		if (timeZoneList.isEmpty())
			return new ResponseEntity<List<TimeZone>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<TimeZone>>(timeZoneList, HttpStatus.OK);
	}
}
