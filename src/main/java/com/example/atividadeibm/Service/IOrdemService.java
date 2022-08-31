package com.example.atividadeibm.Service;


import com.example.atividadeibm.Model.OrdemServicoModel;

import java.util.ArrayList;

public interface IOrdemService {
    public ArrayList<OrdemServicoModel> busarTodos();
    public OrdemServicoModel buscarPeloId(Integer id);
    public OrdemServicoModel excluirPeloId(Integer id);
    public OrdemServicoModel criarNovo(OrdemServicoModel dados);
    public OrdemServicoModel atualizar(OrdemServicoModel dados);

}

