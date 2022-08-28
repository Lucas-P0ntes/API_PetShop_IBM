package com.example.atividadeibm.Service;

import com.example.atividadeibm.Model.ClienteModel;
import com.example.atividadeibm.RepositorioDAO.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private ClienteDAO dao;

    @Override
    public ClienteModel criarnovo(ClienteModel novo) {
        return null;
    }

    @Override
    public ClienteModel atualizardados(ClienteModel dados) {
        return null;
    }

    @Override
    public ArrayList<ClienteModel> buscartodos() {
        ArrayList<ClienteModel> lista = (ArrayList<ClienteModel>) dao.findAll();
        return lista;

    }

    @Override
    public ClienteModel buscarpeloid(Integer id) {
        return null;
    }

    @Override
    public ClienteModel excluircliente(Integer id) {
        return null;
    }
}