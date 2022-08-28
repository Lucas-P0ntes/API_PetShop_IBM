package com.example.atividadeibm.Controller;

import com.example.atividadeibm.RepositorioDAO.OrdemServicoDAO;
import com.example.atividadeibm.Model.OrdemServicoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class OrdemServicoController {
    @Autowired
    private OrdemServicoDAO dao;

    @GetMapping("/ordemgetall")
    public ArrayList<OrdemServicoModel> Recuperartodos(){
        ArrayList<OrdemServicoModel> lista = (ArrayList<OrdemServicoModel>) dao.findAll();
        return lista;
    }



}




