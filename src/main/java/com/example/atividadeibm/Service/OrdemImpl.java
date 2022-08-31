package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.OrdemServicoModel;
import com.example.atividadeibm.RepositorioDAO.OrdemServicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class OrdemImpl implements IOrdemService{
    @Autowired
    private OrdemServicoDAO dao ;

    @Override
    public ArrayList<OrdemServicoModel> busarTodos() {
        return  (ArrayList<OrdemServicoModel>) dao.findAll();

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
       if(dados.getValor()!=null && dados.getHora_saida()!= null && dados.getHora_saida() != null){

        return dao.save(dados);
       }
       return null;
    }

    @Override
    public OrdemServicoModel atualizar(OrdemServicoModel dados) {
        if(dados.getHora_saida()!= null && dados.getHora_saida()!= null){
            return dao.save(dados);


        }
        return null;
    }
}
