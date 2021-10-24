package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Servico;
import com.antonialucianapires.petshop.exceptions.ObjetoNaoEncontradoException;
import com.antonialucianapires.petshop.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico recuperarServicoPorId(int id) {
        return servicoRepository.findById(id)
                .orElseThrow(() -> new ObjetoNaoEncontradoException("Serviço não encontrado."));
    }

}
