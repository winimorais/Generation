package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    List<Cliente> findByDataNascimento(LocalDate dataNascimento);

    List<Cliente> findByNomeAndDataNascimento(String nome, LocalDate dataNascimento);



}