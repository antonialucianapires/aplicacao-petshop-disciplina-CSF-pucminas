package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Pessoa;
import com.antonialucianapires.petshop.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/{id}")
    public Pessoa recuperarPessoaPorId(@PathVariable int id) {
        return pessoaService.recuperarPessoaPorId(id);
    }

    @GetMapping
    public List<Pessoa> recuperarTodasAsCategorias() {
        return pessoaService.recuperarTodasAsPessoas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa cadastrarNovaPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.cadastrarPessoa(pessoa);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarPessoa(@RequestBody Pessoa pessoa, @PathVariable int id) {
        pessoa.setId(id);
        pessoaService.atualizarPessoa(pessoa);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPessoa(@PathVariable int id) {
        pessoaService.deletarPessoa(id);
    }
}
