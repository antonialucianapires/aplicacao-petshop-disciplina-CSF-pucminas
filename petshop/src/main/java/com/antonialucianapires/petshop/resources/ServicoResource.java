package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Servico;
import com.antonialucianapires.petshop.dto.ServicoDTO;
import com.antonialucianapires.petshop.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicos")
public class ServicoResource {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/{id}")
    public Servico recuperarServicoPorId(@PathVariable int id) {
        return servicoService.recuperarServicoPorId(id);
    }

    @GetMapping
    public List<ServicoDTO> recuperarTodosOsServicos() {
        return servicoService.recuperarTodasOsServicos().stream().map(ServicoDTO::new).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Servico cadastrarServico(@RequestBody Servico servico) {
        return servicoService.cadastrarServico(servico);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarServico(@RequestBody Servico servico, @PathVariable int id) {
        servico.setId(id);
        servicoService.atualizarServico(servico);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarServico(@PathVariable int id) {
        servicoService.deletarServico(id);
    }
}
