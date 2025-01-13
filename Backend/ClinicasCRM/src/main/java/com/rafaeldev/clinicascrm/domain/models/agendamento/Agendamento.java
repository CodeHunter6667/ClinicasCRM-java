package com.rafaeldev.clinicascrm.domain.models.agendamento;

import com.rafaeldev.clinicascrm.domain.enums.EStatusAtendimento;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.procedimento.Procedimento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "tb_agendamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private PessoaFisica cliente;
    private String salaAtendimento;
    private Procedimento procedimento;
    private Integer duracao;
    private LocalDateTime diaAtendimento;
    private String profissional;
    private EStatusAtendimento statusAtendimento;
}
