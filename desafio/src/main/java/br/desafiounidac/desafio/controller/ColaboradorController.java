package br.desafiounidac.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.desafiounidac.desafio.service.ColaboradorService;
import br.desafiounidac.desafio.entity.Colaborador;


@RestController
@RequestMapping("/api/colaborador")
public class ColaboradorController {
    
    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Colaborador> buscarTodos() {
        return colaboradorService.buscarTodos();
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Colaborador inserir(@RequestBody Colaborador colaborador) {
        return colaboradorService.inserir(colaborador);
    }

    
    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Colaborador alterar(@RequestBody Colaborador colaborador) {
        return colaboradorService.alterar(colaborador);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        colaboradorService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
