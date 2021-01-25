package br.com.treinaweb.jpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // To indicate an entity
@Table(name = "PES_PESSOAS") // To indicate the table creation with the written name
public class Pessoa {

	@Id // To indicate a primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // To indicate the auto increment
	@Column(name = "PES_ID") // To set column properties 
	private int id;
	
	@Column(name = "PES_NOME", nullable = false, length = 20)
	private String nome;
	
	@Column(name = "PES_SOBRENOME", nullable = false, length = 30)
	private String sobrenome;
	
	@Column(name = "PES_IDADE", nullable = false)
	private int idade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
