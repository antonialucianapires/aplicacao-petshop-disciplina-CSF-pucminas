package com.antonialucianapires.petshop.repositories;

import com.antonialucianapires.petshop.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
