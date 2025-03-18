package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.domain.service.ArregloFloralService;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/arreglofloral")
public class ArregloFloralController {

    @Autowired
    private ArregloFloralService arregloFloralService;

    @GetMapping("/all")
    public ResponseEntity<List<FlowerArrangement>> getAll(){
        return new ResponseEntity<>(arregloFloralService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlowerArrangement> get(@PathVariable("id") Integer id){
        return arregloFloralService.get(id)
                .map(FlowerArrangement -> new ResponseEntity<>(FlowerArrangement, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<FlowerArrangement> save(@RequestBody FlowerArrangement flowerArrangement){
        return new ResponseEntity<>(arregloFloralService.save(flowerArrangement), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteArregloFloral(@PathVariable("id") Integer id){
        if(arregloFloralService.delet(id)) {
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public Optional<FlowerArrangement> updateArregloFloral(@PathVariable("id") Integer id, @RequestBody FlowerArrangement flowerArrangement){
        return arregloFloralService.update(id, flowerArrangement);
    }
}
