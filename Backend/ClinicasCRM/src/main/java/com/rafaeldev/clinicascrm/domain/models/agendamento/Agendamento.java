package com.rafaeldev.clinicascrm.domain.models.agendamento;

import com.rafaeldev.clinicascrm.domain.enums.EStatusAtendimento;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.procedimento.Procedimento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agendamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
