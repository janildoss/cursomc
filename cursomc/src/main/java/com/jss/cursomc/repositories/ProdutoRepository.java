package com.jss.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jss.cursomc.dominio.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
