package com.rafaeldev.clinicascrm.domain.models.procedimento;

import com.rafaeldev.clinicascrm.domain.enums.EFormaPagamento;
import com.rafaeldev.clinicascrm.domain.models.agendamento.Agendamento;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_procedimento")
public class Procedimento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private String usuarioCriacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(nullable = false, length = 100)
    private String nomeProcedimento;
    @Column(nullable = false)
    private Integer duracao;
    @Column(nullable = false, length = 150)
    private String equipamentosUtilizados;
    @Column(nullable = false, length = 100)
    private String consumoProdutos;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private EFormaPagamento formaPagamento;
    @OneToMany(mappedBy = "procedimento")
    private List<Agendamento> agendamentos = new ArrayList<>();

    public Procedimento() {
    }

    public Procedimento(Long id,
                        boolean estaSalva,
                        String usuarioCriacao,
                        LocalDateTime dataCriacao,
                        LocalDateTime dataAlteracao,
                        String nomeProcedimento,
                        Integer duracao,
                        String equipamentosUtilizados,
                        String consumoProdutos,
                        Double preco,
                        EFormaPagamento formaPagamento,
                        List<Agendamento> agendamentos) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.usuarioCriacao = usuarioCriacao;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.nomeProcedimento = nomeProcedimento;
        this.duracao = duracao;
        this.equipamentosUtilizados = equipamentosUtilizados;
        this.consumoProdutos = consumoProdutos;
        this.preco = preco;
        this.formaPagamento = formaPagamento;
        this.agendamentos = agendamentos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEstaSalva() {
        return estaSalva;
    }

    public void setEstaSalva(boolean estaSalva) {
        this.estaSalva = estaSalva;
    }

    public String getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(String usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getEquipamentosUtilizados() {
        return equipamentosUtilizados;
    }

    public void setEquipamentosUtilizados(String equipamentosUtilizados) {
        this.equipamentosUtilizados = equipamentosUtilizados;
    }

    public String getConsumoProdutos() {
        return consumoProdutos;
    }

    public void setConsumoProdutos(String consumoProdutos) {
        this.consumoProdutos = consumoProdutos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public EFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(EFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
