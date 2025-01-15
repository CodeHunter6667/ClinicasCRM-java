package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.enums.EFrequenciaConsumoAlcool;
import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_habitos")
@Inheritance(strategy = InheritanceType.JOINED)
public class Habitos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private boolean alimentacaoBalanceada;
    private boolean intestinoRegular;
    private boolean sonoRegular;
    private boolean praticaAtividadeFisica;
    private Integer diasAtividadeFisica;
    private boolean fumante;
    private boolean consomeBebidaAlcoolica;
    private boolean usoAcidosPele;
    private EFrequenciaConsumoAlcool frequenciaConsumoAlcool;
    @Column(length = 100)
    private String acidosUsados;
    private boolean usaProtetorSolarDiario;
    @OneToMany(mappedBy = "habitos")
    private List<Anamnese> anamneses = new ArrayList<>();

    public Habitos() {
    }

    public Habitos(Long id,
                   boolean estaSalva,
                   LocalDateTime dataCriacao,
                   LocalDateTime dataAlteracao,
                   boolean alimentacaoBalanceada,
                   boolean intestinoRegular,
                   boolean sonoRegular,
                   boolean praticaAtividadeFisica,
                   Integer diasAtividadeFisica,
                   boolean fumante,
                   boolean consomeBebidaAlcoolica,
                   boolean usoAcidosPele,
                   EFrequenciaConsumoAlcool frequenciaConsumoAlcool,
                   String acidosUsados,
                   boolean usaProtetorSolarDiario,
                   List<Anamnese> anamneses) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.alimentacaoBalanceada = alimentacaoBalanceada;
        this.intestinoRegular = intestinoRegular;
        this.sonoRegular = sonoRegular;
        this.praticaAtividadeFisica = praticaAtividadeFisica;
        this.diasAtividadeFisica = diasAtividadeFisica;
        this.fumante = fumante;
        this.consomeBebidaAlcoolica = consomeBebidaAlcoolica;
        this.usoAcidosPele = usoAcidosPele;
        this.frequenciaConsumoAlcool = frequenciaConsumoAlcool;
        this.acidosUsados = acidosUsados;
        this.usaProtetorSolarDiario = usaProtetorSolarDiario;
        this.anamneses = anamneses;
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

    public boolean isAlimentacaoBalanceada() {
        return alimentacaoBalanceada;
    }

    public void setAlimentacaoBalanceada(boolean alimentacaoBalanceada) {
        this.alimentacaoBalanceada = alimentacaoBalanceada;
    }

    public boolean isIntestinoRegular() {
        return intestinoRegular;
    }

    public void setIntestinoRegular(boolean intestinoRegular) {
        this.intestinoRegular = intestinoRegular;
    }

    public boolean isSonoRegular() {
        return sonoRegular;
    }

    public void setSonoRegular(boolean sonoRegular) {
        this.sonoRegular = sonoRegular;
    }

    public boolean isPraticaAtividadeFisica() {
        return praticaAtividadeFisica;
    }

    public void setPraticaAtividadeFisica(boolean praticaAtividadeFisica) {
        this.praticaAtividadeFisica = praticaAtividadeFisica;
    }

    public Integer getDiasAtividadeFisica() {
        return diasAtividadeFisica;
    }

    public void setDiasAtividadeFisica(Integer diasAtividadeFisica) {
        this.diasAtividadeFisica = diasAtividadeFisica;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public boolean isConsomeBebidaAlcoolica() {
        return consomeBebidaAlcoolica;
    }

    public void setConsomeBebidaAlcoolica(boolean consomeBebidaAlcoolica) {
        this.consomeBebidaAlcoolica = consomeBebidaAlcoolica;
    }

    public boolean isUsoAcidosPele() {
        return usoAcidosPele;
    }

    public void setUsoAcidosPele(boolean usoAcidosPele) {
        this.usoAcidosPele = usoAcidosPele;
    }

    public EFrequenciaConsumoAlcool getFrequenciaConsumoAlcool() {
        return frequenciaConsumoAlcool;
    }

    public void setFrequenciaConsumoAlcool(EFrequenciaConsumoAlcool frequenciaConsumoAlcool) {
        this.frequenciaConsumoAlcool = frequenciaConsumoAlcool;
    }

    public String getAcidosUsados() {
        return acidosUsados;
    }

    public void setAcidosUsados(String acidosUsados) {
        this.acidosUsados = acidosUsados;
    }

    public boolean isUsaProtetorSolarDiario() {
        return usaProtetorSolarDiario;
    }

    public void setUsaProtetorSolarDiario(boolean usaProtetorSolarDiario) {
        this.usaProtetorSolarDiario = usaProtetorSolarDiario;
    }

    public List<Anamnese> getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(List<Anamnese> anamneses) {
        this.anamneses = anamneses;
    }
}
