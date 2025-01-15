package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_medidas")
public class Medidas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private Double peso;
    private Double altura;
    private Double busto;
    private Double bracoEsquerdo;
    private Double bracoDireito;
    private Double abdomenSuperior;
    private Double quadril;
    private Double coxaDireita;
    private Double coxaEsquerda;
    private Double panturrilhaDireita;
    private Double panturrilhaEsquerda;
    private LocalDateTime dataMedicao;
    @OneToMany(mappedBy = "medidas")
    private List<AvaliacaoCorporal> avaliacaoCorporal = new ArrayList<>();

    public Medidas() {
    }

    public Medidas(Long id,
                   boolean estaSalva,
                   LocalDateTime dataCriacao,
                   LocalDateTime dataAlteracao,
                   Double peso,
                   Double altura,
                   Double busto,
                   Double bracoEsquerdo,
                   Double bracoDireito,
                   Double abdomenSuperior,
                   Double quadril,
                   Double coxaDireita,
                   Double coxaEsquerda,
                   Double panturrilhaDireita,
                   Double panturrilhaEsquerda,
                   LocalDateTime dataMedicao,
                   List<AvaliacaoCorporal> avaliacaoCorporal) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.peso = peso;
        this.altura = altura;
        this.busto = busto;
        this.bracoEsquerdo = bracoEsquerdo;
        this.bracoDireito = bracoDireito;
        this.abdomenSuperior = abdomenSuperior;
        this.quadril = quadril;
        this.coxaDireita = coxaDireita;
        this.coxaEsquerda = coxaEsquerda;
        this.panturrilhaDireita = panturrilhaDireita;
        this.panturrilhaEsquerda = panturrilhaEsquerda;
        this.dataMedicao = dataMedicao;
        this.avaliacaoCorporal = avaliacaoCorporal;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBusto() {
        return busto;
    }

    public void setBusto(Double busto) {
        this.busto = busto;
    }

    public Double getBracoEsquerdo() {
        return bracoEsquerdo;
    }

    public void setBracoEsquerdo(Double bracoEsquerdo) {
        this.bracoEsquerdo = bracoEsquerdo;
    }

    public Double getBracoDireito() {
        return bracoDireito;
    }

    public void setBracoDireito(Double bracoDireito) {
        this.bracoDireito = bracoDireito;
    }

    public Double getAbdomenSuperior() {
        return abdomenSuperior;
    }

    public void setAbdomenSuperior(Double abdomenSuperior) {
        this.abdomenSuperior = abdomenSuperior;
    }

    public Double getQuadril() {
        return quadril;
    }

    public void setQuadril(Double quadril) {
        this.quadril = quadril;
    }

    public Double getCoxaDireita() {
        return coxaDireita;
    }

    public void setCoxaDireita(Double coxaDireita) {
        this.coxaDireita = coxaDireita;
    }

    public Double getCoxaEsquerda() {
        return coxaEsquerda;
    }

    public void setCoxaEsquerda(Double coxaEsquerda) {
        this.coxaEsquerda = coxaEsquerda;
    }

    public Double getPanturrilhaDireita() {
        return panturrilhaDireita;
    }

    public void setPanturrilhaDireita(Double panturrilhaDireita) {
        this.panturrilhaDireita = panturrilhaDireita;
    }

    public Double getPanturrilhaEsquerda() {
        return panturrilhaEsquerda;
    }

    public void setPanturrilhaEsquerda(Double panturrilhaEsquerda) {
        this.panturrilhaEsquerda = panturrilhaEsquerda;
    }

    public LocalDateTime getDataMedicao() {
        return dataMedicao;
    }

    public void setDataMedicao(LocalDateTime dataMedicao) {
        this.dataMedicao = dataMedicao;
    }

    public List<AvaliacaoCorporal> getAvaliacaoCorporal() {
        return avaliacaoCorporal;
    }

    public void setAvaliacaoCorporal(List<AvaliacaoCorporal> avaliacaoCorporal) {
        this.avaliacaoCorporal = avaliacaoCorporal;
    }
}
