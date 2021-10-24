package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Servico;
import com.antonialucianapires.petshop.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos")
public class ServicoResource {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/{id}")
    public Servico recuperarPessoaPorId(@PathVariable int id) {
        return servicoService.recuperarServicoPorId(id);
    }
}
