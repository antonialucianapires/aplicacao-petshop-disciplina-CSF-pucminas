package com.antonialucianapires.petshop.services;

import com.antonialucianapires.petshop.domain.Pessoa;
import com.antonialucianapires.petshop.exceptions.DataIntegrityViolationException;
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

    public Pessoa cadastrarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void atualizarPessoa(Pessoa pessoa) {
        recuperarPessoaPorId(pessoa.getId());
        pessoaRepository.save(pessoa);
    }

    public void deletarPessoa(int id) {
        recuperarPessoaPorId(id);

        try {
            pessoaRepository.deleteById(id);
        } catch (org.springframework.dao.DataIntegrityViolationException dataIntegrityViolationException) {
            throw new DataIntegrityViolationException("Não é possível apagar esta pessoa porque ela possui produtos e serviços associados.");
        }


    }

}
