package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.paciente.Habitos;
import com.rafaeldev.clinicascrm.domain.models.paciente.HabitosFemininos;
import com.rafaeldev.clinicascrm.domain.models.paciente.HistoricoPaciente;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "tb_anamnese")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Anamnese {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @OneToOne
    @JoinColumn(name = "historico_paciente_id")
    private HistoricoPaciente historicoPaciente;
    @OneToOne
    @JoinColumn(name = "habitos_id")
    private Habitos habitos;
}
