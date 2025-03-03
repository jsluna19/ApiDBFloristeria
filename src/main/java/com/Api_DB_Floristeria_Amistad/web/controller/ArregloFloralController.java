package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;
import com.Api_DB_Floristeria_Amistad.service.ArregloFloralService;
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
    public List<ArregloFloral> getAllArregloFloral(){
        return arregloFloralService.getAllArregloFloral();
    }

    @GetMapping("/{arregloFloralId}")
    public Optional<ArregloFloral> getArregloFloral(@PathVariable("arregloFloralId") Integer arregloFloralId){
        return arregloFloralService.getArregloFloral(arregloFloralId);
    }

    @PostMapping("/save")
    public ArregloFloral saveArregloFloral(@RequestBody ArregloFloral arregloFloral){
        return arregloFloralService.saveArregloFloral(arregloFloral);
    }

    @DeleteMapping("/delete/{arregloFloralId}")
    public boolean deleteArregloFloral(@PathVariable("arregloFloralId") Integer arregloFloralId){
        return arregloFloralService.deleteArregloFloral(arregloFloralId);
    }

    @PutMapping("/update/{arregloFloralId}")
    public Optional<ArregloFloral> updateArregloFloral(@PathVariable("arregloFloralId") Integer arregloFloralId, @RequestBody ArregloFloral arregloFloral){
        return arregloFloralService.updateArregloFloral(arregloFloralId, arregloFloral);
    }
}
