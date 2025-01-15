package com.rafaeldev.clinicascrm.domain.models.avaliacao;

import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseCorporal;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.paciente.Medidas;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_avaliacao_corporal")
public class AvaliacaoCorporal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(length = 300)
    private String principaisQueixas;
    @ManyToOne
    @JoinColumn(name = "medidas_id")
    private Medidas medidas;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @Column(length = 400)
    private String anotacoesTratamentoEscolhido;
    private LocalDateTime dataAvaliacao;
    @Column(length = 400)
    private String observacoes;
    @OneToMany(mappedBy = "avaliacaoCorporal")
    private List<AnamneseCorporal> anamnesesCorporais = new ArrayList<>();

    public AvaliacaoCorporal() {
    }

    public AvaliacaoCorporal(Long id,
                             boolean estaSalva,
                             LocalDateTime dataCriacao,
                             LocalDateTime dataAlteracao,
                             String principaisQueixas,
                             Medidas medidas,
                             PessoaFisica cliente,
                             String anotacoesTratamentoEscolhido,
                             LocalDateTime dataAvaliacao,
                             String observacoes,
                             List<AnamneseCorporal> anamnesesCorporais) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.principaisQueixas = principaisQueixas;
        this.medidas = medidas;
        this.cliente = cliente;
        this.anotacoesTratamentoEscolhido = anotacoesTratamentoEscolhido;
        this.dataAvaliacao = dataAvaliacao;
        this.observacoes = observacoes;
        this.anamnesesCorporais = anamnesesCorporais;
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

    public String getPrincipaisQueixas() {
        return principaisQueixas;
    }

    public void setPrincipaisQueixas(String principaisQueixas) {
        this.principaisQueixas = principaisQueixas;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }

    public String getAnotacoesTratamentoEscolhido() {
        return anotacoesTratamentoEscolhido;
    }

    public void setAnotacoesTratamentoEscolhido(String anotacoesTratamentoEscolhido) {
        this.anotacoesTratamentoEscolhido = anotacoesTratamentoEscolhido;
    }

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDateTime dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<AnamneseCorporal> getAnamnesesCorporais() {
        return anamnesesCorporais;
    }

    public void setAnamnesesCorporais(List<AnamneseCorporal> anamnesesCorporais) {
        this.anamnesesCorporais = anamnesesCorporais;
    }
}
