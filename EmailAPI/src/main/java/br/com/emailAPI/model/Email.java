package br.com.emailAPI.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emails")
public class Email {
	
	//VARIAVEIS EMAIL
	
	@Id
	@GeneratedValue
	private Long id;
	private Instant dataEnvio;
	private Instant dataRecebimento;
	private String conteudoEmail;
	private String assuntoEmail;
	private String autorEmail;
	
	//GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Instant dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public Instant getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Instant dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public String getConteudoEmail() {
		return conteudoEmail;
	}
	public void setConteudoEmail(String conteudoEmail) {
		this.conteudoEmail = conteudoEmail;
	}
	public String getAssuntoEmail() {
		return assuntoEmail;
	}
	public void setAssuntoEmail(String assuntoEmail) {
		this.assuntoEmail = assuntoEmail;
	}
	public String getAutorEmail() {
		return autorEmail;
	}
	public void setAutorEmail(String autorEmail) {
		this.autorEmail = autorEmail;
	}
	
}
