package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Servico;
import com.antonialucianapires.petshop.exceptions.DataIntegrityViolationException;
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

    public Servico cadastrarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void atualizarServico(Servico servico) {
        recuperarServicoPorId(servico.getId());
        servicoRepository.save(servico);
    }

    public void deletarServico(int id) {
        recuperarServicoPorId(id);

        try {
            servicoRepository.deleteById(id);
        } catch (org.springframework.dao.DataIntegrityViolationException dataIntegrityViolationException) {
            throw new DataIntegrityViolationException("Não é possível apagar este serviço porque ele possui produtos, pessoas e pagamentos associados.");
        }


    }

}
