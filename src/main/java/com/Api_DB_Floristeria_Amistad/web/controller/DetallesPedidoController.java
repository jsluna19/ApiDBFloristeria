package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.persistence.entity.DetallesPedido;
import com.Api_DB_Floristeria_Amistad.service.DetallesPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detallesPedido")
public class DetallesPedidoController {

    @Autowired
    private DetallesPedidoService detallesPedidoService;

    @GetMapping("/all")
    public List<DetallesPedido> getAll(){
        return detallesPedidoService.getAllDetallesPedido();
    }

    @GetMapping("/{detallesPedidoId}")
    public Optional<DetallesPedido> getDetallesPedido(@PathVariable("detallesPedidoId") Integer detallesPedidoId){
        return detallesPedidoService.getDetallesPedido(detallesPedidoId);
    }

    @GetMapping("/save")
    public DetallesPedido save(@RequestBody DetallesPedido detallesPedido){
        return detallesPedidoService.saveDetallesPedido(detallesPedido);
    }

    @GetMapping("/delete/{detallesPedidoId}")
    public boolean delete(@PathVariable("detallesPedidoId") Integer detallesPedidoId){
        return detallesPedidoService.deleteDetallesPedido(detallesPedidoId);
    }

    @PutMapping("/update/{detallesPedidoId}")
    public Optional<DetallesPedido> update(@RequestBody DetallesPedido detallesPedido, @PathVariable("detallesPedidoId") Integer detallesPedidoId){
        return detallesPedidoService.updateDetallesPedido(detallesPedido, detallesPedidoId);
    }
}
