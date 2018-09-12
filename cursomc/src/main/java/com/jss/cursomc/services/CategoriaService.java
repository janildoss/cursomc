package com.jss.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.cursomc.dominio.Categoria;
import com.jss.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	//para vrsoes menor qu 2.0
	//public Categoria buscar(Integer id) {
	//	Categoria obj = repo.findOne(id);
	//	return obj;
	//}
	public Categoria find(Integer id){	
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
