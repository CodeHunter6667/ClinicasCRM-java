package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
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
@Table(name = "tb_medidas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
