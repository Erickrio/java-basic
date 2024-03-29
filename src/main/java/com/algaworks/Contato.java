package com.algaworks;

import java.util.Objects;

public class Contato {
	
	private String id;
	
	private String nome;
	
	private String telefone;
	
	public Contato () {
		
	}
	
	public Contato(String id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public boolean isNovo() {
		return id == null;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

	

}
