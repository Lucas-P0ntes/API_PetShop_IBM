package com.example.atividadeibm.Controller;

import com.example.atividadeibm.Model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Cliente {
    @Autowired
    private ClienteDAO dao ;

    @GetMapping("/cliente")
    public ArrayList<ClienteModel> Recuperartodos(){
        ArrayList<ClienteModel> lista = (ArrayList<ClienteModel>) dao.findAll();
        return list;
    }
}
