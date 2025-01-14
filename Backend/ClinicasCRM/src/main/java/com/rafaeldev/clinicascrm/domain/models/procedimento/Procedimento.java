package com.rafaeldev.clinicascrm.domain.models.procedimento;

import com.rafaeldev.clinicascrm.domain.enums.EFormaPagamento;
import com.rafaeldev.clinicascrm.domain.models.agendamento.Agendamento;
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
@Table(name = "tb_procedimento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Procedimento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private String usuarioCriacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(nullable = false, length = 100)
    private String nomeProcedimento;
    @Column(nullable = false)
    private Integer duracao;
    @Column(nullable = false, length = 150)
    private String equipamentosUtilizados;
    @Column(nullable = false, length = 100)
    private String consumoProdutos;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private EFormaPagamento formaPagamento;
    @OneToMany(mappedBy = "procedimento")
    private List<Agendamento> agendamentos = new ArrayList<>();
}
