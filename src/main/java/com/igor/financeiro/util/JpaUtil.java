package com.igor.financeiro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("FinanceiroPU");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	// Agora, sempre que precisarmos de uma EntityManager, podemos chamar:
	// EntityManager manager = JpaUtil.getEntityManager();
	

}
