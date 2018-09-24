package com.jss.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jss.cursomc.dominio.Pedido;
import com.jss.cursomc.repositories.PedidoRepository;
import com.jss.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	//PARA VERSOES MENOR 2.0
	//public Pedido buscar(Integer id) {
	//	Pedido obj = repo.findOne(id);
	//	return obj;
	//}
	public Pedido find(Integer id){	
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:"+id+",Tipo:" + Pedido.class.getName()));
		
		//return obj.orElse(null);
	}
}
