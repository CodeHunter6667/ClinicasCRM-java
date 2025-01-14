package com.rafaeldev.clinicascrm.domain.models.avaliacao;

import com.rafaeldev.clinicascrm.domain.enums.*;
import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseFacial;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
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
@Table(name = "tb_avaliacao_facial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFacial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @Column(length = 300)
    private String principaisQueixas;
    private boolean prersencaManchasPigmentaresRelacionadasMelanina = false;
    private boolean presencaManchasAlteracaoVascular = false;
    private boolean formacoesSolidas = false;
    private boolean formacoesComConteudoLiquido = false;
    private boolean lesoesDePele = false;
    private boolean sequelasOuCicatrizes = false;
    private boolean alteracoesPelosFaciais = false;
    private boolean alteracoesQueratinizacao = false;
    private EClassificacaoCutanea classificacaoCutanea;
    private EClassificacaoOleosidade classificacaoOleosidade;
    private EClassificacaoEspessura classificacaoEspessura;
    private EClassificacaoSensibilidade classificacaoSensibilidade;
    @Column(length = 400)
    private String observacoes;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @OneToMany(mappedBy = "avaliacaoFacial")
    private List<AnamneseFacial> anamnesesFaciais = new ArrayList<>();
}
