package com.example.atividadeibm.Controller;


import com.example.atividadeibm.Model.AnimalModel;

import com.example.atividadeibm.Service.IAnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AnimalController {
    @Autowired
    private IAnimalService service;

    @GetMapping("/animal")
    public ArrayList<AnimalModel> Recuperartodos(){

        return  service.buscartodos();

    }

    @PostMapping("/animal")
    public ResponseEntity<AnimalModel> adicionaranimal(@RequestBody AnimalModel novo){
        AnimalModel res = service.criarnovo(novo);
        if(res!=null){
            return  ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }
    @GetMapping("/animal/{id}")
    public ResponseEntity<AnimalModel> buscarpeloid(@PathVariable int id){
        AnimalModel res = service.buscarpeloid(id);
        if(res!=null){


            return  ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();


    }
    @PutMapping("/animal")
    public ResponseEntity<AnimalModel> atualizarAnimal(@RequestBody AnimalModel dados){
        AnimalModel res = service.atualizardados(dados);
        if(res!=null){

            return  ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();


    }
    @DeleteMapping("/animal/{id}")
    public ResponseEntity<AnimalModel> deletar(@PathVariable Integer id) {
        AnimalModel res = service.excluirAnimal(id);

        return  ResponseEntity.ok(res);
    }


}