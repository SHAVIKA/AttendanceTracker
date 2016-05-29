package com.shavika.attendance.tracker.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.shavika.attendance.tracker.api.dto.Organization;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;
import com.shavika.attendance.tracker.organization.service.OrganizationService;

@RestController
public class OrganizationRSController {

	@Autowired
	OrganizationService organizationService;

	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public ResponseEntity<List<Organization>> listAllOrganizations() throws ShavikaAppException {
		System.out.println("============= GET All...");
		List<Organization> organizations = organizationService.getAllOrganization();
		System.out.println("============= GET All... size="+organizations.size());
		System.out.println("============= GET All... organizations="+organizations);
		if (organizations.isEmpty())
			return new ResponseEntity<List<Organization>>(HttpStatus.NO_CONTENT);
		System.out.println("============= GET All... organizations=123");
		return new ResponseEntity<List<Organization>>(organizations, HttpStatus.OK);
	}

	@RequestMapping(value = "/organization/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Organization> getOrganization(@PathVariable("id") long id) throws ShavikaAppException {
		System.out.println("============= GET...");
		Organization organization = organizationService.getOrganization(id);
		if (organization == null)
			return new ResponseEntity<Organization>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<Organization>(organization, HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/organization", method = RequestMethod.POST)
	public ResponseEntity<Void> createOrganization(@RequestBody Organization organization, UriComponentsBuilder ucBuilder) throws ShavikaAppException {
		System.out.println("============= CREATE...");
		System.out.println("============= organization="+organization);
		if (organizationService.isOrganizationExist(organization))
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		organizationService.save(organization);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/organization/{id}").buildAndExpand(organization.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/organization/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Organization> updateOrganization(@PathVariable("id") long id, @RequestBody Organization org) throws ShavikaAppException {
		System.out.println("============= UPDATE...");
		Organization organization = organizationService.getOrganization(id);
		if (organization == null)
			return new ResponseEntity<Organization>(HttpStatus.NOT_FOUND);
		organization.setName(org.getName());
		organization.setRegistrationNumber(org.getRegistrationNumber());
		organization.setPhoneNumber1(org.getPhoneNumber1());
		organizationService.update(organization);
		return new ResponseEntity<Organization>(organization, HttpStatus.OK);
	}

	@RequestMapping(value = "/organization/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Organization> deleteOrganization(@PathVariable("id") long id) throws ShavikaAppException {
		System.out.println("============= DELETE...");
		Organization organization = organizationService.getOrganization(id);
		if (organization == null)
			return new ResponseEntity<Organization>(HttpStatus.NOT_FOUND);

		organizationService.delete(organization);
		return new ResponseEntity<Organization>(HttpStatus.NO_CONTENT);
	}
}
