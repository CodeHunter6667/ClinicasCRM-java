package com.rafaeldev.clinicascrm.domain.models.paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "tb_historico_paciente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private String tratamentosAnteriores;
    private String alergias;
    private String tratamentosOncologicos;
    private boolean hipertensao;
    private boolean diabetes;
    private boolean problemasCardiacos;
    private boolean marcapasso;
    private boolean protesesMetalicas;
    private boolean protesesdentarias;
    private boolean epilepsia;
    private boolean fazTratamentoMedico;
}
