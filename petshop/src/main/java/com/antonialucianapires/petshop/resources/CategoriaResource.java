package com.antonialucianapires.petshop.resources;

import com.antonialucianapires.petshop.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> recuperarCategorias() {

        Categoria categoria1 = new Categoria(1, "Alimento");
        Categoria categoria2 = new Categoria(1, "Cosmético");
        Categoria categoria3 = new Categoria(1, "Remédio");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);

        return categorias;
    }

}
