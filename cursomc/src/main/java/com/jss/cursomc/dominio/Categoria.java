package com.jss.cursomc.dominio;

import java.io.Serializable;

public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public Integer Id;
	public String nome;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public Categoria(){
	//construtor	
	}



	public Categoria(Integer id, String nome) {
		//construtor de fields
		super();
		Id = id;
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Categoria [Id=" + Id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//Hash code
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
}