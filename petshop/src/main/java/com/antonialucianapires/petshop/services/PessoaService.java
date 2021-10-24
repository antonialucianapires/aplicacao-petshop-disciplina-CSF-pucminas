package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Pessoa;
import com.antonialucianapires.petshop.exceptions.ObjetoNaoEncontradoException;
import com.antonialucianapires.petshop.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa recuperarPessoaPorId(int id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new ObjetoNaoEncontradoException("Pessoa não encontrada."));
    }

}
