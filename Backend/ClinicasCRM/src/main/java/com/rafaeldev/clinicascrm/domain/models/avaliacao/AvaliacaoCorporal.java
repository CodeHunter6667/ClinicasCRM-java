package com.rafaeldev.clinicascrm.domain.models.avaliacao;

import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.paciente.Medidas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_avaliacao_corporal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoCorporal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private String principaisQueixas;
    @OneToMany(mappedBy = "avaliacaoCorporal")
    private List<Medidas> medidas = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    private String anotacoesTratamentoEscolhido;
    private LocalDateTime dataAvaliacao;
    private String observacoes;
}
