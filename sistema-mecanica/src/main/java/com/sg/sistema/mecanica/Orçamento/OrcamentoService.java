package com.sg.sistema.mecanica.Orçamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class OrcamentoService {
    @Autowired
    OrcamentoRepository orcamentoRepository;

    public Orcamento getById(Long id) {
        return orcamentoRepository.getById(id);
    }

    public  Orcamento findById(Long id) {
        return orcamentoRepository.getById(id);
    }

    public void save(Orcamento orcamento){
        orcamentoRepository.save(orcamento);
    }

    public List<Orcamento> findAll(){
        return orcamentoRepository.findAll();
    }

    public void aceitarOrcamento(Long id) {
        Orcamento orcamento =  orcamentoRepository.getById(id);
        orcamento.setAtivo(true);
        orcamento.setDataInicio(Calendar.getInstance());
    }

    public void finalizarServicos(Long id) {
        Orcamento orcamento = orcamentoRepository.getById(id);
        orcamento.setDataFim(Calendar.getInstance());
        orcamento.setDiasTrabalhados(orcamento.calcularDiasTrabalhados());

        orcamentoRepository.getById(id).getDataFim();
    }
}
