package com.sg.sistema.mecanica.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {
    @Autowired
    ServicoService servicoService;

    @PostMapping
    public Servico cadastrarFuncionario(@RequestBody @Validated Servico servico){
        return servicoService.save(servico);
    }
    @GetMapping
    public List<Servico> listarServico(){
        return servicoService.findAll();
    }





}
