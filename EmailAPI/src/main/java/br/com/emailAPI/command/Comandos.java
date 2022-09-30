package br.com.emailAPI.command;

import java.util.List;

import br.com.emailAPI.model.Email;
import br.com.emailAPI.repository.EmailRepository;

	//COMANDOS EMAILS

public class Comandos {
	//LISTA OS EMAILS
	public List<Email> listEmail(EmailRepository emailRepository) {
		return emailRepository.findAll();
	}
	
	//CRIA NOVO EMAIL
	public Email createEmail(EmailRepository emailRepository, Email email) {
		return emailRepository.save(email);
	}
	
	//DELETA EMAIL EXISTENTE
	public void deleteEmail(EmailRepository emailRepository, Long id) {
		if (emailRepository.existsById(id)) {
			emailRepository.deleteById(id);
		}
	}
	
	//MUDA INFORMACOES EMAIL JA CRIADO
	public Email updateEmail(EmailRepository emailRepository, Long id, Email novoEmail) {
		
		Email email = emailRepository.getById(id);
     
		email.setDataEnvio(novoEmail.getDataEnvio());
		email.setDataRecebimento(novoEmail.getDataRecebimento());
		email.setConteudoEmail(novoEmail.getConteudoEmail());
		email.setAssuntoEmail(novoEmail.getAssuntoEmail());
		email.setAutorEmail(novoEmail.getAutorEmail());
	
       return emailRepository.save(email); 
    }

}
