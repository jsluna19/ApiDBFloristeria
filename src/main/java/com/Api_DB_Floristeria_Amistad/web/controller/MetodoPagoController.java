package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.persistence.entity.MetodoPago;
import com.Api_DB_Floristeria_Amistad.service.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/metodoPago")
public class MetodoPagoController {

    @Autowired
    private MetodoPagoService metodoPagoService;

    @GetMapping("/all")
    public List<MetodoPago> getAll(){
        return metodoPagoService.getAllMetodoPago();
    }

    @GetMapping("/{metodoPagoId}")
    public Optional<MetodoPago> getMetodoPago(@PathVariable("metodoPagoId") Integer metodopagoId){
        return metodoPagoService.getMetodoPago(metodopagoId);
    }

    @PostMapping("/save")
    public MetodoPago save(@RequestBody MetodoPago metodopago){
        return metodoPagoService.saveMetodoPago(metodopago);
    }

    @DeleteMapping("/delete/{metodoPagoId}")
    public boolean delete(@PathVariable("metodoPagoId") Integer metodopagoId){
        return metodoPagoService.deleteMetodoPago(metodopagoId);
    }

    @PutMapping("/update/{metodoPagoId}")
    public Optional<MetodoPago> update(@RequestBody MetodoPago metodopago, @PathVariable("metodoPagoId") Integer metodopagoId){
        return metodoPagoService.updateMetodoPago(metodopago, metodopagoId);
    }
}
