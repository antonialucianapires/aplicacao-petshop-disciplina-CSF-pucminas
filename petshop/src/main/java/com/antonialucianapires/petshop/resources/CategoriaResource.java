package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Categoria;
import com.antonialucianapires.petshop.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public Categoria recuperarCategoriaPorId(@PathVariable int id) {
        return categoriaService.recuperarCategoriaPorId(id);
    }

}
