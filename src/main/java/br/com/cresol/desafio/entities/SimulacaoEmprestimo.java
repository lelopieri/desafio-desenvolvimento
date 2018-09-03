package br.com.cresol.desafio.entities;

import java.math.BigDecimal;
import java.util.Date;

public class SimulacaoEmprestimo {

    private Integer id;
    private Integer numeroContrato;
    private Date dataSimulacao;
    private Date dataValidadeSimmulacao;
    private BigDecimal valorContrato;
    private int quantidadeParcelas;
    private BigDecimal valorParcela;
    private BigDecimal taxaJurosEmprestimo;
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataSimulacao() {
        return dataSimulacao;
    }

    public void setDataSimulacao(Date dataSimulacao) {
        this.dataSimulacao = dataSimulacao;
    }

    public Date getDataValidadeSimmulacao() {
        return dataValidadeSimmulacao;
    }

    public void setDataValidadeSimmulacao(Date dataValidadeSimmulacao) {
        this.dataValidadeSimmulacao = dataValidadeSimmulacao;
    }

    public BigDecimal getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(BigDecimal valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public BigDecimal getTaxaJurosEmprestimo() {
        return taxaJurosEmprestimo;
    }

    public void setTaxaJurosEmprestimo(BigDecimal taxaJurosEmprestimo) {
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
