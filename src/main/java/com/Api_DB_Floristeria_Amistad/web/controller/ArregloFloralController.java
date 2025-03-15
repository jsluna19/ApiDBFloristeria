package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.domain.service.ArregloFloralService;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/arreglofloral")
public class ArregloFloralController {

    @Autowired
    private ArregloFloralService arregloFloralService;

    @GetMapping("/all")
    public List<FlowerArrangement> getAll(){
        return arregloFloralService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<FlowerArrangement> get(@PathVariable("id") Integer id){
        return arregloFloralService.get(id);
    }

    @PostMapping("/save")
    public FlowerArrangement save(@RequestBody FlowerArrangement flowerArrangement){
        return arregloFloralService.save(flowerArrangement);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteArregloFloral(@PathVariable("id") Integer id){
        return arregloFloralService.dele(id);
    }

    @PutMapping("/update/{id}")
    public Optional<FlowerArrangement> updateArregloFloral(@PathVariable("id") Integer id, @RequestBody FlowerArrangement flowerArrangement){
        return arregloFloralService.update(id, flowerArrangement);
    }
}
