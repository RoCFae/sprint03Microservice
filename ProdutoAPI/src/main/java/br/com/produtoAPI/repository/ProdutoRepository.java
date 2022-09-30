package br.com.produtoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.produtoAPI.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
