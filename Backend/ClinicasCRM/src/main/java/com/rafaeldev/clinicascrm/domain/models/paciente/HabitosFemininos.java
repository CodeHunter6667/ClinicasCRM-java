package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.enums.EFrequenciaConsumoAlcool;
import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_habitos_femininos")
public class HabitosFemininos extends Habitos implements Serializable {
    private boolean cicloMenstrualRegular;
    private boolean usoAnticoncepcionalRegular;
    private boolean gestante;
    private boolean lactante;
    private boolean temFilhos;
    private Integer quantosFilhos;

    public HabitosFemininos() {
    }

    public HabitosFemininos(Long id,
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
                            List<Anamnese> anamneses,
                            boolean cicloMenstrualRegular,
                            boolean usoAnticoncepcionalRegular,
                            boolean gestante,
                            boolean lactante,
                            boolean temFilhos,
                            Integer quantosFilhos) {
        super(id,
                estaSalva,
                dataCriacao,
                dataAlteracao,
                alimentacaoBalanceada,
                intestinoRegular,
                sonoRegular,
                praticaAtividadeFisica,
                diasAtividadeFisica,
                fumante,
                consomeBebidaAlcoolica,
                usoAcidosPele,
                frequenciaConsumoAlcool,
                acidosUsados,
                usaProtetorSolarDiario,
                anamneses);
        this.cicloMenstrualRegular = cicloMenstrualRegular;
        this.usoAnticoncepcionalRegular = usoAnticoncepcionalRegular;
        this.gestante = gestante;
        this.lactante = lactante;
        this.temFilhos = temFilhos;
        this.quantosFilhos = quantosFilhos;
    }

    public boolean isCicloMenstrualRegular() {
        return cicloMenstrualRegular;
    }

    public void setCicloMenstrualRegular(boolean cicloMenstrualRegular) {
        this.cicloMenstrualRegular = cicloMenstrualRegular;
    }

    public boolean isUsoAnticoncepcionalRegular() {
        return usoAnticoncepcionalRegular;
    }

    public void setUsoAnticoncepcionalRegular(boolean usoAnticoncepcionalRegular) {
        this.usoAnticoncepcionalRegular = usoAnticoncepcionalRegular;
    }

    public boolean isGestante() {
        return gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public boolean isLactante() {
        return lactante;
    }

    public void setLactante(boolean lactante) {
        this.lactante = lactante;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    public Integer getQuantosFilhos() {
        return quantosFilhos;
    }

    public void setQuantosFilhos(Integer quantosFilhos) {
        this.quantosFilhos = quantosFilhos;
    }
}
