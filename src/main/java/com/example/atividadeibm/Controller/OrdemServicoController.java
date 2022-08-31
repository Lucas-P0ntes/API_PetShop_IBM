package com.example.atividadeibm.Controller;

import com.example.atividadeibm.Model.OrdemServicoModel;


import com.example.atividadeibm.Service.IOrdemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController

public class OrdemServicoController {
    @Autowired
    private IOrdemService service;

    @GetMapping("/ordem")
    public ArrayList<OrdemServicoModel> Recuperartodos(){
        return service.busarTodos();

    }
    @GetMapping("/ordem/{id}")
    public OrdemServicoModel buscarPorId(@PathVariable Integer id){
        OrdemServicoModel res =service.buscarPeloId(id);
        return res;
    }
    @PostMapping("/ordem")
    public OrdemServicoModel criarNovo(@RequestBody OrdemServicoModel dados){
        return service.criarNovo(dados);
    }
    @PutMapping("/ordem")
    public OrdemServicoModel atualizar(@RequestBody OrdemServicoModel dados){
        return service.atualizar(dados);
    }
    @DeleteMapping("/ordem/{id}")
    public OrdemServicoModel apagar(@PathVariable Integer id){
            return service.excluirPeloId(id);
        }
    }









