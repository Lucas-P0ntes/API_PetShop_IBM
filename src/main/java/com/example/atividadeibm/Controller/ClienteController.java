package com.example.atividadeibm.Controller;

import com.example.atividadeibm.RepositorioDAO.ClienteDAO;
import com.example.atividadeibm.Model.ClienteModel;
import com.example.atividadeibm.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/clientes")
    public ArrayList<ClienteModel> Recuperartodos(){
        return service.buscartodos();
    }
   @PostMapping("/clientes")
    public ResponseEntity<ClienteModel> incluirNovo(@RequestBody ClienteModel novo){
        ClienteModel res= service.criarnovo(novo);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
   }
    @PutMapping("/clientes")
    public ResponseEntity<ClienteModel> atualizar(@RequestBody ClienteModel dados){
        ClienteModel res= service.atualizardados(dados);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<ClienteModel> deletar(@PathVariable Integer id){
        ClienteModel res= service.excluircliente(id);

            return ResponseEntity.ok(res);


    }
    @GetMapping ("/clientes/{id}")
    public ResponseEntity<ClienteModel> buscarid(@PathVariable Integer id){
        ClienteModel res= service.buscarpeloid(id);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();


    }
}
