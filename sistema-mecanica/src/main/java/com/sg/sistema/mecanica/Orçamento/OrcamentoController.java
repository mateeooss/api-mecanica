package com.sg.sistema.mecanica.Orçamento;

import com.sg.sistema.mecanica.Servicos.Servico;
import com.sg.sistema.mecanica.Servicos.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {
    @Autowired
    OrcamentoService orcamentoService;
    @Autowired
    ServicoService servicoService;

    @PostMapping
    public void salvarOrcamento(@RequestBody Orcamento orcamento){
        orcamentoService.save(orcamento);
    }

    @GetMapping
    public List<Orcamento> listarOrcamentos(){
     return orcamentoService.findAll();
    }

    @PutMapping("/{id}")
    public void adicionarServico(@RequestBody Servico servico, @PathVariable Long id){
        servicoService.save(servico);
        Orcamento orcamento = orcamentoService.findById(id);
        orcamento.salvarServico(servico);
        orcamentoService.save(orcamento);
    }
    @DeleteMapping("/{id}")
    public void deletarOrcamento(@PathVariable Long id){
        orcamentoService.deletarOrcamento(id);
    }
    @GetMapping("/a/{id}")
    public String retornarPapelorcamento(@PathVariable Long id){
        return orcamentoService.findById(id).toString();
    }
    @PutMapping("/fimservicos/{id}")
    public void finalizarServicos(@PathVariable Long id) throws Exception {
        orcamentoService.finalizarServicos(id);
    }

    @PutMapping("/aceitar-orcamento/{id}")
    public void  aceitarOrcamento(@PathVariable Long id) throws Exception {
        orcamentoService.aceitarOrcamento(id);
    }
}

