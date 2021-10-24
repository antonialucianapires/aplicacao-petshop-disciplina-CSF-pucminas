package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Pessoa;
import com.antonialucianapires.petshop.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/{id}")
    public Pessoa recuperarPessoaPorId(@PathVariable int id) {
        return pessoaService.recuperarPessoaPorId(id);
    }
}
