package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.AnimalModel;
import com.example.atividadeibm.RepositorioDAO.AnimalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class AnimalServiceImpl implements IAnimalService {
    @Autowired
    private AnimalDAO dao;

    @Override
    public AnimalModel criarnovo(AnimalModel novo) {
//        if (novo.getNome()!=null && novo.getPeso()!=null &&novo.getIdade()!=null){
            return dao.save(novo);
//        }

    }
    @Override
    public AnimalModel atualizardados(AnimalModel dados) {
        if (dados.getId()!=null && dados.getNome()!=null && dados.getPeso()!=null && dados.getIdade()!=null){
            return dao.save(dados);
        }
        return null ;
    }

    @Override
    public ArrayList<AnimalModel> buscartodos() {
        ArrayList<AnimalModel> res = (ArrayList<AnimalModel>) dao.findAll();
        return res;
    }

    @Override
    public AnimalModel buscarpeloid(Integer id) {
        if(id!=null){
            return dao.findById(id).orElse(null);
        }
        return null;
    }
    @Override
    public AnimalModel excluirAnimal(Integer id) {
             dao.deleteById(id);
        return null;
    }
}
