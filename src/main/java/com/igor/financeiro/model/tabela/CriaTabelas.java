package com.igor.financeiro.model.tabela;

import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("FinanceiroPU");
		
		
	}

}
