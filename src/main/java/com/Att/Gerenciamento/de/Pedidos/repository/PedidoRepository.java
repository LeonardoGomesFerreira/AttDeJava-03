package com.Att.Gerenciamento.de.Pedidos.repository;

import com.Att.Gerenciamento.de.Pedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}