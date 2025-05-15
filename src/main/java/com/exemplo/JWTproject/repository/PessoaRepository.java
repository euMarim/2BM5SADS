package com.exemplo.JWTproject.repository;

import com.exemplo.JWTproject.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    //Realiza uma busca pelo login

    UserDetails findByLogin(String role);
}
