package com.lucioaraujo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
