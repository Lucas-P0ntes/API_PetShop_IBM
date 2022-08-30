package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.AnimalModel;

import java.util.ArrayList;

public interface IAnimalService {

    public AnimalModel criarnovo(AnimalModel novo);
    public AnimalModel atualizardados(AnimalModel dados);
    public ArrayList<AnimalModel> buscartodos ();
    public AnimalModel buscarpeloid(Integer id);
    public AnimalModel excluirAnimal(Integer id);
}
