package br.com.emailAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emailAPI.command.Comandos;
import br.com.emailAPI.model.Email;
import br.com.emailAPI.repository.EmailRepository;

@RestController
@RequestMapping("emails")
public class EmailController {
	
	private EmailRepository emailRepository;
	private Comandos comandos;
	
	
	public EmailController(EmailRepository emailRepository) {
		this.emailRepository = emailRepository;
		this.comandos = new Comandos();
	}
	
	
	@GetMapping("/listar")
	public List<Email> listEmail() {
		return comandos.listEmail(emailRepository);
	}
	
	@PostMapping("/salvar")
	public Email createEmail(@RequestBody Email email) {
		return comandos.createEmail(emailRepository, email);
	}  

	@DeleteMapping("/{id}")
	public void deleteEmail(@PathVariable("id")Long id) {
		comandos.deleteEmail(emailRepository, id);
	}

	@PutMapping("/update/{id}")
	public Email updateEmail(@PathVariable Long id, @RequestBody Email email) {
		return comandos.updateEmail(emailRepository, id, email);
	}

}
