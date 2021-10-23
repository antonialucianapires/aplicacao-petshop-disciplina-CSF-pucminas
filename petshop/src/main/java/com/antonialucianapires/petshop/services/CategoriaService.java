package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Categoria;
import com.antonialucianapires.petshop.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria recuperarCategoriaPorId(int id) {
        return categoriaRepository.findById(id).orElse(new Categoria());
    }

}
