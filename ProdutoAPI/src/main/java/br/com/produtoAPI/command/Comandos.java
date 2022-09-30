package br.com.produtoAPI.command;

import java.util.List;

import br.com.produtoAPI.model.Produto;
import br.com.produtoAPI.repository.ProdutoRepository;

	//COMANDOS PRODUTOS

public class Comandos {
	
	//LISTA PRODUTOS
	public List<Produto> listProdutos(ProdutoRepository produtoRepository) {
		return produtoRepository.findAll();
	}
	
	//CRIA NOVO PRODUTO
	public Produto createProduto(ProdutoRepository produtoRepository, Produto produto) {
		return produtoRepository.save(produto);
	}

	//DELETA PRODUTO EXISTENTE
	public void deleteProduto(ProdutoRepository produtoRepository, Long id) {
		if (produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
		}
	}
	
	//MUDA INFORMACOES DO PRODUTO JA CRIADO
	public Produto updateProduto(ProdutoRepository produtoRepository, Long id, Produto novoProduto) {
		
		Produto produto = produtoRepository.getById(id);
     
		produto.setNomeProduto(novoProduto.getNomeProduto());
		produto.setTipoProduto(novoProduto.getTipoProduto());
		produto.setPrecoProduto(novoProduto.getPrecoProduto());
		produto.setEstoqueProduto(novoProduto.getEstoqueProduto());
	
       return produtoRepository.save(produto); 
    }
}
