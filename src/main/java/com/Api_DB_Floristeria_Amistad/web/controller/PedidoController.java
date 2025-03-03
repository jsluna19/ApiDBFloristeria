package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;
import com.Api_DB_Floristeria_Amistad.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/all")
    public List<Pedido> getAll(){
        return pedidoService.getAllPedido();
    }

    @GetMapping("/{pedidoId}")
    public Optional<Pedido> getPedido(@PathVariable("pedidoId") Integer pedidoId){
        return pedidoService.getPedido(pedidoId);
    }

    @PostMapping("/save")
    public Pedido save(@RequestBody Pedido pedido){
        return pedidoService.savePedido(pedido);
    }

    @GetMapping("/delete/{pedidoId}")
    public boolean delete(@PathVariable("pedidoID") Integer pedidoId){
        return pedidoService.deletePedido(pedidoId);
    }

    @PutMapping("/update/{pedidoId}")
    public Optional<Pedido> update(@RequestBody Pedido pedido, @PathVariable("pedidoId") Integer pedidoId){
        return pedidoService.updatePedido(pedido, pedidoId);
    }

}
