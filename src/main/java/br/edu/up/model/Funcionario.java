package br.edu.up.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer Id;
	
	@Column (name = "Nome", nullable = false)
	private String Nome;
	
	@Column (name = "Cpf", nullable = false)
	private String Cpf;
	
	@Column (name = "Rg", nullable = false)
	private String Rg;

	@Column (name = "Data de nascimento", nullable = false)
	private Date data_nasc;
	
	@Column (name = "Idade", nullable = false)
	private int Idade;
	
	@Column (name = "Email", nullable = false)
	private String Email;
	
	@Column (name = "Cargo", nullable = false)
	private String Cargo;
	
	@Column (name = "Salario", nullable = false)
	private String Salario;
	
	@Column (name = "Carga_horaria", nullable = false)
	private String Carga_horaria;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getSalario() {
		return Salario;
	}

	public void setSalario(String salario) {
		Salario = salario;
	}

	public String getCarga_horaria() {
		return Carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		Carga_horaria = carga_horaria;
	}
	
	
}
