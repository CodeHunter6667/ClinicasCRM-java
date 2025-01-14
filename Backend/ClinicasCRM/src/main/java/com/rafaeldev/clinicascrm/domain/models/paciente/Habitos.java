package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.enums.EFrequenciaConsumoAlcool;
import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_habitos")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
