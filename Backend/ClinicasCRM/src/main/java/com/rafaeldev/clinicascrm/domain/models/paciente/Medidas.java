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

@Entity(name = "tb_medidas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medidas {
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
}
