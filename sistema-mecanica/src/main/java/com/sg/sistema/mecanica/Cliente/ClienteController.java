package com.sg.sistema.mecanica.Cliente;

import com.sg.sistema.mecanica.Orçamento.Orcamento;
import com.sg.sistema.mecanica.Orçamento.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @Autowired
    OrcamentoService orcamentoService;

    @PostMapping
    public void salvarCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id){
        return clienteService.findById(id);
    }


}
