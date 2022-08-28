package com.example.atividadeibm.RepositorioDAO;

import com.example.atividadeibm.Model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<ClienteModel, Integer> {
}
