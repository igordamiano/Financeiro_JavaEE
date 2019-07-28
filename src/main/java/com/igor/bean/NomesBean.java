package com.igor.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean

//@RequestScoped
// (padrão): tem vida curta, começando quando é referenciado em uma única requisição HTTP e terminando quando a
// resposta é enviada de volta ao cliente. Por isso o segundo nome some ao ser inserido

@ViewScoped
//a instância permanece ativa até que o usuário navegue para uma próxima página.

//@SessionScoped 
// mantém a instância durante diversas requisições e até mesmo navegações entre páginas, até que a sessão do usuário seja invalidada
// ou o tempo limite é atingido. Cada usuário possui sua sessão de navegação, portanto, os objetos não são compartilhados entre os usuários.

//@ApplicationScoped
// mantém a instância durante todo o tempo de execução da aplicação. É um escopo que compartilha os objetos para todos os usuários do sistema.

public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<String>();
	
	// backing bean
	private HtmlInputText inputNome;
	private HtmlCommandButton botaodicionar;

	public String adicionar() {
		this.nomes.add(nome);
		
		// desativa campo e botão quando mais de 3 nomes forem adicionados
		if (this.nomes.size() > 3) {
			this.inputNome.setDisabled(true);
			this.botaodicionar.setDisabled(true);
			this.botaodicionar.setValue("Muitos nomes adicionados");
		}
		
//		if (this.nomes.size() > 3) {
//			// redireciona para página Ola
//			return "Ola?faces-redirect=true";
//		}
	
		return "";
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public HtmlCommandButton getBotaodicionar() {
		return botaodicionar;
	}

	public void setBotaodicionar(HtmlCommandButton botaodicionar) {
		this.botaodicionar = botaodicionar;
	}
	
	

}
