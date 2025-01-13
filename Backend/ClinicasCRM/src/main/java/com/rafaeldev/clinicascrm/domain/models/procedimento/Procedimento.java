package com.rafaeldev.clinicascrm.domain.models.procedimento;

import com.rafaeldev.clinicascrm.domain.enums.EFormaPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "tb_procedimento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private String usuarioCriacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private String nomeProcedimento;
    private Integer duracao;
    private String equipamentosUtilizados;
    private String consumoProdutos;
    private Double preco;
    private EFormaPagamento formaPagamento;
}
