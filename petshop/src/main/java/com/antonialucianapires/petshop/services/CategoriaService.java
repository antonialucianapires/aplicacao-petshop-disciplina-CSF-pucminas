package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Categoria;
import com.antonialucianapires.petshop.exceptions.ObjetoNaoEncontradoException;
import com.antonialucianapires.petshop.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria recuperarCategoriaPorId(int id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new ObjetoNaoEncontradoException("Categoria não encontrada."));
    }

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void atualizarCategoria(Categoria categoria) {
        recuperarCategoriaPorId(categoria.getId());
        categoriaRepository.save(categoria);
    }

    public void deletarCategoria(int id) {
        recuperarCategoriaPorId(id);
        categoriaRepository.deleteById(id);
    }

}
