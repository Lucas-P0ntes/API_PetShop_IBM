package com.example.atividadeibm.Controller;

import com.example.atividadeibm.RepositorioDAO.ClienteDAO;
import com.example.atividadeibm.Model.ClienteModel;
import com.example.atividadeibm.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/clientegetall")
    public ArrayList<ClienteModel> Recuperartodos(){
        return service.buscartodos();
    }
}
