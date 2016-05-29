package com.example.utils;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.shavika.attendance.tracker.api.dto.Privilege;
import com.shavika.attendance.tracker.api.dto.Roles;
import com.shavika.attendance.tracker.api.dto.UserLogin;

public class MappingManager {

	private static void userrolemapping() {
		// loads configuration and mappings
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Privilege privilege1 = new Privilege("Organization page");
		Privilege privilege2 = new Privilege("manger page");
		Privilege privilege3 = new Privilege("Employee page");
		Privilege privilege4 = new Privilege("Leave page");
		Privilege privilege5 = new Privilege("device page");
		Set<Privilege> listPrivilege = new HashSet<Privilege>();
		listPrivilege.add(privilege1);
		listPrivilege.add(privilege2);
		listPrivilege.add(privilege3);
		listPrivilege.add(privilege4);
		listPrivilege.add(privilege5);

		Roles roles = new Roles("ADMIN", "He can do any thing", true, null, listPrivilege);
		UserLogin userLogin = new UserLogin("mbmahesha47@gmail.com", "Mahesha", "admin", true, 0, "1234567890");
		userLogin.setRoles(roles);
		session.save(userLogin);

		Set<Privilege> listPrivilege1 = new HashSet<Privilege>();
		listPrivilege1.add(privilege2);
		listPrivilege1.add(privilege3);
		listPrivilege1.add(privilege4);
		Roles roles1 = new Roles("MANAGER", "He can do only update", true, listPrivilege1);
		UserLogin userLogin1 = new UserLogin("mahes.psece@gmail.com", "mahesh", "manager", true, 0, "1234567890");
		userLogin1.setRoles(roles1);
		session.save(userLogin1);

		Set<Privilege> listPrivilege2 = new HashSet<Privilege>();
		listPrivilege2.add(privilege3);
		Roles roles2 = new Roles("USER", "He can do read only", true, listPrivilege2);
		session.save(roles2);

		session.getTransaction().commit();
		session.close();
	}

	private static void mappedSuperclass() {
		// loads configuration and mappings
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// obtains the session
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		UserLogin userLogin1 = new UserLogin("mbmahesha47@gmail.com", "mahesh", "admin", true, 0, "1234567890");

		System.out.println("2^^^^^^userLogin1" + userLogin1.getModifiedOn());
		System.out.println("2^^^^^^userLogin1" + userLogin1.getCreatedOn());
		session.save(userLogin1);
		System.out.println("2^^^^^^userLogin1" + userLogin1.getModifiedOn());
		System.out.println("2^^^^^^userLogin1" + userLogin1.getCreatedOn());
		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {
		userrolemapping();
		// mappedSuperclass();
	}

}
