package br.com.produtoAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
	
	//VARIAVEIS PRODUTO
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nomeProduto;
	private String tipoProduto;
	private float precoProduto;
	private int estoqueProduto;
	
	//GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getEstoqueProduto() {
		return estoqueProduto;
	}
	public void setEstoqueProduto(int estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}

}
