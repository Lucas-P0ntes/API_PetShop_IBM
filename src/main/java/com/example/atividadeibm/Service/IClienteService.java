package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.ClienteModel;
import  java.util.ArrayList;
public interface IClienteService {
    public ClienteModel criarnovo(ClienteModel novo);
    public ClienteModel atualizardados(ClienteModel dados);
    public ArrayList<ClienteModel> buscartodos ();
    public ClienteModel buscarpeloid(Integer id);
    public ClienteModel excluircliente(Integer id);
}
