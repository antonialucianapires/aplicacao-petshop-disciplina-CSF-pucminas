package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Categoria;
import com.antonialucianapires.petshop.dto.CategoriaDTO;
import com.antonialucianapires.petshop.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public Categoria recuperarCategoriaPorId(@PathVariable int id) {
        return categoriaService.recuperarCategoriaPorId(id);
    }

    @GetMapping
    public List<CategoriaDTO> recuperarTodasAsCategorias() {
        return categoriaService.recuperarTodasAsCategorias().stream().map(CategoriaDTO::new).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria cadastrarNovaCategoria(@RequestBody Categoria categoria) {
        return categoriaService.cadastrarCategoria(categoria);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarCategoria(@RequestBody Categoria categoria, @PathVariable int id) {
        categoria.setId(id);
        categoriaService.atualizarCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCategoria(@PathVariable int id) {
        categoriaService.deletarCategoria(id);
    }

}
