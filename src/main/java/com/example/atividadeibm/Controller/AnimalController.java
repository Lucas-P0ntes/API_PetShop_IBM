package com.example.atividadeibm.Controller;

import com.example.atividadeibm.DAO.AnimalDAO;

import com.example.atividadeibm.Model.AnimalModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimalController {
    @Autowired
    private AnimalDAO dao ;

    @GetMapping("/Animalgetall")
    public ArrayList<AnimalModel> Recuperartodos(){
        ArrayList<AnimalModel> lista = (ArrayList<AnimalModel>) dao.findAll();
        return lista;
    }
}