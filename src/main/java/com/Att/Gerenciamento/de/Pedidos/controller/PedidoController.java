package com.Att.Gerenciamento.de.Pedidos.controller;

import com.Att.Gerenciamento.de.Pedidos.entity.Pedido;
import com.Att.Gerenciamento.de.Pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    // POST /pedidos
    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }

    // GET /pedidos
    @GetMapping
    public List<Pedido> listar() {
        return service.listarTodos();
    }

    // GET /pedidos/{id}
    @GetMapping("/{id}")
    public Optional<Pedido> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // DELETE /pedidos/{id}
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}