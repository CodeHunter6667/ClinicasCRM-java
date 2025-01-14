package com.rafaeldev.clinicascrm.domain.models.paciente;

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
@Table(name = "tb_historico_paciente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoPaciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(length = 250)
    private String tratamentosAnteriores;
    @Column(length = 150)
    private String alergias;
    @Column(length = 150)
    private String tratamentosOncologicos;
    private boolean hipertensao;
    private boolean diabetes;
    private boolean problemasCardiacos;
    private boolean marcapasso;
    private boolean protesesMetalicas;
    private boolean protesesdentarias;
    private boolean epilepsia;
    private boolean fazTratamentoMedico;
    @OneToMany(mappedBy = "historicoPaciente")
    private List<Anamnese> anamneses = new ArrayList<>();
}
