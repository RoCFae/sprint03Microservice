package br.com.produtoAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtoAPI.command.Comandos;
import br.com.produtoAPI.model.Produto;
import br.com.produtoAPI.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	private ProdutoRepository produtoRepository;
	private Comandos comandos;
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
		this.comandos = new Comandos();
	}
	
	@GetMapping("/list")
	public List<Produto> listProdutos(){
		return comandos.listProdutos(produtoRepository);
	}
	
	@PostMapping("/save")
	public Produto createProduto(@RequestBody Produto produto) {
		return comandos.createProduto(produtoRepository, produto);
	}
	
	@PutMapping("/update/{id}")
	public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
		return comandos.updateProduto(produtoRepository, id, produto);
	}

}
