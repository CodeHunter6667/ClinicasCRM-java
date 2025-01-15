package com.rafaeldev.clinicascrm.domain.models.agendamento;

import com.rafaeldev.clinicascrm.domain.enums.EStatusAtendimento;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.procedimento.Procedimento;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @Column(nullable = false, length = 50)
    private String salaAtendimento;
    @ManyToOne
    @JoinColumn(name = "procedimento_id")
    private Procedimento procedimento;
    @Column(nullable = false)
    private Integer duracao;
    @Column(nullable = false)
    private LocalDateTime diaAtendimento;
    @Column(nullable = false)
    private String profissional;
    private EStatusAtendimento statusAtendimento;

    public Agendamento() {
    }

    public Agendamento(Long id,
                       boolean estaSalva,
                       LocalDateTime dataCriacao,
                       LocalDateTime dataAlteracao,
                       PessoaFisica cliente,
                       String salaAtendimento,
                       Procedimento procedimento,
                       Integer duracao,
                       LocalDateTime diaAtendimento,
                       String profissional,
                       EStatusAtendimento statusAtendimento) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.cliente = cliente;
        this.salaAtendimento = salaAtendimento;
        this.procedimento = procedimento;
        this.duracao = duracao;
        this.diaAtendimento = diaAtendimento;
        this.profissional = profissional;
        this.statusAtendimento = statusAtendimento;
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

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }

    public String getSalaAtendimento() {
        return salaAtendimento;
    }

    public void setSalaAtendimento(String salaAtendimento) {
        this.salaAtendimento = salaAtendimento;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public LocalDateTime getDiaAtendimento() {
        return diaAtendimento;
    }

    public void setDiaAtendimento(LocalDateTime diaAtendimento) {
        this.diaAtendimento = diaAtendimento;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public EStatusAtendimento getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(EStatusAtendimento statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }
}
