package com.jss.cursomc.DTO;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.jss.cursomc.dominio.Categoria;

public class CategoriaDTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	public Integer id;
	//tratamento com Bea Validator
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(min=5, max=80,message="O tamanho deve ser entre 5 e 80 caracteres")
	public String nome;

	public CategoriaDTO() {		
	}
	
	public CategoriaDTO(Categoria obj){
		  id = obj.getId();
		  nome = obj.getNome();

		}

	public Integer getId() {
		return id; 
	}

	public void setId(Integer Id) {
		id = Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
