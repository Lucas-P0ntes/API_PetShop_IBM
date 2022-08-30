package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.OrdemServicoModel;
import com.example.atividadeibm.RepositorioDAO.OrdemServicoDAO;

import java.util.ArrayList;

public class OrdemImpl implements IOrdemService{
    OrdemServicoDAO dao ;

    @Override
    public ArrayList<OrdemServicoModel> busarTodos() {
         return  (ArrayList<OrdemServicoModel>)dao.findAll();

    }

    @Override
    public OrdemServicoModel buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);


    }

    @Override
    public OrdemServicoModel excluirPeloId(Integer id) {
         dao.deleteById(id);
        return null;
    }

    @Override
    public OrdemServicoModel criarNovo(OrdemServicoModel dados) {
       //if(dados.)
        dao.save(dados);
    }

    @Override
    public OrdemServicoModel atualizar(OrdemServicoModel dados) {
        return null;
    }
}
