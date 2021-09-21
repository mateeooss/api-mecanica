package com.sg.sistema.mecanica.Orçamento;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sg.sistema.mecanica.Carro.Carro;
import com.sg.sistema.mecanica.Cliente.Cliente;
import com.sg.sistema.mecanica.Funcionario.Funcionario;
import com.sg.sistema.mecanica.Servicos.Servico;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;

@Entity
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;
    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    private boolean ativo = false;
    private Calendar dataInicio;
    private Calendar dataFim ;

    private int diasTrabalhados;

    @ManyToMany()
    private List<Servico> servicos;

    public Orcamento() {
    }

    public Orcamento(Carro carro, Funcionario funcionario, List<Servico> servicos) {
        this.carro = carro;
        this.funcionario = funcionario;
        this.servicos = servicos;
    }

    public Long getId() {
        return id;
    }

    public void salvarServico(Servico servico) {
        servicos.add(servico);
    }

    public int calcularDiasTrabalhados(){
        LocalDate inicio = Instant.ofEpochMilli(dataInicio.getTimeInMillis()).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fim = Instant.ofEpochMilli(dataFim.getTimeInMillis()).atZone(ZoneId.systemDefault()).toLocalDate();
        int diasCorridos = Period.between(inicio, fim).getDays();
        return diasCorridos;

    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }
//
    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Servico> getServicos() {
        return servicos;
    }


}
