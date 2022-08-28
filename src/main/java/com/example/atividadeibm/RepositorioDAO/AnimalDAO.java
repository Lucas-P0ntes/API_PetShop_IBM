package com.example.atividadeibm.RepositorioDAO;

import com.example.atividadeibm.Model.AnimalModel;
import org.springframework.data.repository.CrudRepository;

public interface AnimalDAO extends CrudRepository<AnimalModel, Integer> {
}
