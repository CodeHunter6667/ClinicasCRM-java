package com.rafaeldev.clinicascrm.domain.models.pessoa;

import com.rafaeldev.clinicascrm.domain.models.agendamento.Agendamento;
import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import com.rafaeldev.clinicascrm.domain.enums.EGenero;
import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("FISICA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa implements Serializable {

    @Column(name = "nome_completo", length = 150, nullable = false)
    private String nomeCompleto;
    @Column(unique = true, length = 11, nullable = false)
    private String cpf;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @Enumerated(EnumType.STRING)
    private EGenero genero;
    @Transient
    private Integer idade;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AvaliacaoCorporal> avaliacoesCorporais = new ArrayList<>();
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AvaliacaoFacial> avaliacoesFaciais = new ArrayList<>();
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Anamnese> anamneses = new ArrayList<>();
    @OneToMany(mappedBy = "cliente")
    private List<Agendamento> agendamentos = new ArrayList<>();

    @PostLoad
    @PostPersist
    @PostUpdate
    private void calcularIdade() {
        if (dataNascimento != null) {
            var hoje = LocalDateTime.now();
            idade = hoje.getYear() - dataNascimento.getYear();
            if (dataNascimento.getDayOfYear() > hoje.getDayOfYear()) {
                idade--;
            }
        } else {
            idade = null;
        }
    }
}
