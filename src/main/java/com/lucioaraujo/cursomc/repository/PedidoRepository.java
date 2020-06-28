package com.lucioaraujo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
