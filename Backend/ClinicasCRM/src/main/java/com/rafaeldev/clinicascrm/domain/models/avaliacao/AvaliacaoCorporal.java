package com.rafaeldev.clinicascrm.domain.models.avaliacao;

import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseCorporal;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.domain.models.paciente.Medidas;
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
@Table(name = "tb_avaliacao_corporal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoCorporal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(length = 300)
    private String principaisQueixas;
    @ManyToOne
    @JoinColumn(name = "medidas_id")
    private Medidas medidas;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @Column(length = 400)
    private String anotacoesTratamentoEscolhido;
    private LocalDateTime dataAvaliacao;
    @Column(length = 400)
    private String observacoes;
    @OneToMany(mappedBy = "avaliacaoCorporal")
    private List<AnamneseCorporal> anamnesesCorporais = new ArrayList<>();
}
