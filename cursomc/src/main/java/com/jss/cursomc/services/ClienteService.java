package com.jss.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jss.cursomc.dominio.Cliente;
import com.jss.cursomc.repositories.ClienteRepository;
import com.jss.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	//PARA VERSOES MENOR 2.0
	//public Cliente buscar(Integer id) {
	//	Cliente obj = repo.findOne(id);
	//	return obj;
	//}
	public Cliente find(Integer id){	
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:"+id+",Tipo:" + Cliente.class.getName()));
		
		//return obj.orElse(null);
	}
}
