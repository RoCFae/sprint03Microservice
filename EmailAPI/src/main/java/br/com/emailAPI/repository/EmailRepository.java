package br.com.emailAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emailAPI.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

}
