package br.desafiounidac.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.desafiounidac.desafio.entity.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
    
}
