package com.sg.sistema.mecanica.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping
    public void salvarFuncionario(@RequestBody Funcionario funcionario){
        funcionarioService.save(funcionario);
    }
    @GetMapping
    public List<Funcionario> listarFuncionarios(){
        return funcionarioService.findAll();
    }


}
