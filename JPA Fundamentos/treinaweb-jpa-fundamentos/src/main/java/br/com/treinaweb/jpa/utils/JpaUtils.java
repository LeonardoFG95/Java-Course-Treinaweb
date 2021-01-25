package br.com.treinaweb.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = null; // Statics attributes must be written in uppercase
	
	// Method to return an Entity Manager
	public static EntityManager getEntityManeger( ) {
		if (ENTITY_MANAGER_FACTORY == null) {
			ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("treinaweb-jpa-fundamentos"); // To load persistence.xml settings
		}
		return ENTITY_MANAGER_FACTORY.createEntityManager();
	}
}
