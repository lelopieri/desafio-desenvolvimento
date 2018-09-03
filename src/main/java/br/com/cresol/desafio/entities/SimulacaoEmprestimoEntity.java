package br.com.cresol.desafio.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "simulacao_emprestimo", schema = "public", catalog = "desafio")
public class SimulacaoEmprestimoEntity {
    private int id;
    private Date dataSimulacao;
    private Date dataValidadeSimulacao;
    private Double valorContrato;
    private Integer quantidadeParcelas;
    private Double valorParcela;
    private Double taxaJurosEmprestimo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "data_simulacao")
    public Date getDataSimulacao() {
        return dataSimulacao;
    }

    public void setDataSimulacao(Date dataSimulacao) {
        this.dataSimulacao = dataSimulacao;
    }

    @Basic
    @Column(name = "data_validade_simulacao")
    public Date getDataValidadeSimulacao() {
        return dataValidadeSimulacao;
    }

    public void setDataValidadeSimulacao(Date dataValidadeSimulacao) {
        this.dataValidadeSimulacao = dataValidadeSimulacao;
    }

    @Basic
    @Column(name = "valor_contrato")
    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Basic
    @Column(name = "quantidade_parcelas")
    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Basic
    @Column(name = "valor_parcela")
    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Basic
    @Column(name = "taxa_juros_emprestimo")
    public Double getTaxaJurosEmprestimo() {
        return taxaJurosEmprestimo;
    }

    public void setTaxaJurosEmprestimo(Double taxaJurosEmprestimo) {
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimulacaoEmprestimoEntity that = (SimulacaoEmprestimoEntity) o;
        return id == that.id &&
                Objects.equals(dataSimulacao, that.dataSimulacao) &&
                Objects.equals(dataValidadeSimulacao, that.dataValidadeSimulacao) &&
                Objects.equals(valorContrato, that.valorContrato) &&
                Objects.equals(quantidadeParcelas, that.quantidadeParcelas) &&
                Objects.equals(valorParcela, that.valorParcela) &&
                Objects.equals(taxaJurosEmprestimo, that.taxaJurosEmprestimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSimulacao, dataValidadeSimulacao, valorContrato, quantidadeParcelas, valorParcela, taxaJurosEmprestimo);
    }
}
