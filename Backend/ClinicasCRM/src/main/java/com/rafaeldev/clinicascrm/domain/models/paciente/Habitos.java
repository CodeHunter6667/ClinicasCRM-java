package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.enums.EFrequenciaConsumoAlcool;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "tb_habitos")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Habitos {
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
    private String acidosUsados;
    private boolean usaProtetorSolarDiario;
}
