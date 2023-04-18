package br.desafiounidac.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.desafiounidac.desafio.repository.ColaboradorRepository;
import br.desafiounidac.desafio.entity.Colaborador;

@Service
public class ColaboradorService {
    
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public List<Colaborador> buscarTodos() {
        return colaboradorRepository.findAll();
    }

    public Colaborador inserir(Colaborador colaborador) {
        return colaboradorRepository.saveAndFlush(colaborador);
    }

    public Colaborador alterar(Colaborador colaborador) {
        return colaboradorRepository.saveAndFlush(colaborador);
    }

    public void excluir(Long id) {
        Colaborador colaborador = colaboradorRepository.findById(id).get();
        colaboradorRepository.delete(colaborador);
    }
}
