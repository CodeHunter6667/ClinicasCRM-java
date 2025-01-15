package com.rafaeldev.clinicascrm.domain.models.avaliacao;

import com.rafaeldev.clinicascrm.domain.enums.*;
import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseFacial;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_avaliacao_facial")
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

    public AvaliacaoFacial(Long id,
                           boolean estaSalva,
                           LocalDateTime dataCriacao,
                           LocalDateTime dataAlteracao,
                           String principaisQueixas,
                           boolean prersencaManchasPigmentaresRelacionadasMelanina,
                           boolean presencaManchasAlteracaoVascular,
                           boolean formacoesSolidas,
                           boolean formacoesComConteudoLiquido,
                           boolean lesoesDePele,
                           boolean sequelasOuCicatrizes,
                           boolean alteracoesPelosFaciais,
                           boolean alteracoesQueratinizacao,
                           EClassificacaoCutanea classificacaoCutanea,
                           EClassificacaoOleosidade classificacaoOleosidade,
                           EClassificacaoEspessura classificacaoEspessura,
                           EClassificacaoSensibilidade classificacaoSensibilidade,
                           String observacoes,
                           PessoaFisica cliente,
                           List<AnamneseFacial> anamnesesFaciais) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.principaisQueixas = principaisQueixas;
        this.prersencaManchasPigmentaresRelacionadasMelanina = prersencaManchasPigmentaresRelacionadasMelanina;
        this.presencaManchasAlteracaoVascular = presencaManchasAlteracaoVascular;
        this.formacoesSolidas = formacoesSolidas;
        this.formacoesComConteudoLiquido = formacoesComConteudoLiquido;
        this.lesoesDePele = lesoesDePele;
        this.sequelasOuCicatrizes = sequelasOuCicatrizes;
        this.alteracoesPelosFaciais = alteracoesPelosFaciais;
        this.alteracoesQueratinizacao = alteracoesQueratinizacao;
        this.classificacaoCutanea = classificacaoCutanea;
        this.classificacaoOleosidade = classificacaoOleosidade;
        this.classificacaoEspessura = classificacaoEspessura;
        this.classificacaoSensibilidade = classificacaoSensibilidade;
        this.observacoes = observacoes;
        this.cliente = cliente;
        this.anamnesesFaciais = anamnesesFaciais;
    }

    public AvaliacaoFacial() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEstaSalva() {
        return estaSalva;
    }

    public void setEstaSalva(boolean estaSalva) {
        this.estaSalva = estaSalva;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getPrincipaisQueixas() {
        return principaisQueixas;
    }

    public void setPrincipaisQueixas(String principaisQueixas) {
        this.principaisQueixas = principaisQueixas;
    }

    public boolean isPrersencaManchasPigmentaresRelacionadasMelanina() {
        return prersencaManchasPigmentaresRelacionadasMelanina;
    }

    public void setPrersencaManchasPigmentaresRelacionadasMelanina(boolean prersencaManchasPigmentaresRelacionadasMelanina) {
        this.prersencaManchasPigmentaresRelacionadasMelanina = prersencaManchasPigmentaresRelacionadasMelanina;
    }

    public boolean isPresencaManchasAlteracaoVascular() {
        return presencaManchasAlteracaoVascular;
    }

    public void setPresencaManchasAlteracaoVascular(boolean presencaManchasAlteracaoVascular) {
        this.presencaManchasAlteracaoVascular = presencaManchasAlteracaoVascular;
    }

    public boolean isFormacoesSolidas() {
        return formacoesSolidas;
    }

    public void setFormacoesSolidas(boolean formacoesSolidas) {
        this.formacoesSolidas = formacoesSolidas;
    }

    public boolean isFormacoesComConteudoLiquido() {
        return formacoesComConteudoLiquido;
    }

    public void setFormacoesComConteudoLiquido(boolean formacoesComConteudoLiquido) {
        this.formacoesComConteudoLiquido = formacoesComConteudoLiquido;
    }

    public boolean isLesoesDePele() {
        return lesoesDePele;
    }

    public void setLesoesDePele(boolean lesoesDePele) {
        this.lesoesDePele = lesoesDePele;
    }

    public boolean isSequelasOuCicatrizes() {
        return sequelasOuCicatrizes;
    }

    public void setSequelasOuCicatrizes(boolean sequelasOuCicatrizes) {
        this.sequelasOuCicatrizes = sequelasOuCicatrizes;
    }

    public boolean isAlteracoesPelosFaciais() {
        return alteracoesPelosFaciais;
    }

    public void setAlteracoesPelosFaciais(boolean alteracoesPelosFaciais) {
        this.alteracoesPelosFaciais = alteracoesPelosFaciais;
    }

    public boolean isAlteracoesQueratinizacao() {
        return alteracoesQueratinizacao;
    }

    public void setAlteracoesQueratinizacao(boolean alteracoesQueratinizacao) {
        this.alteracoesQueratinizacao = alteracoesQueratinizacao;
    }

    public EClassificacaoCutanea getClassificacaoCutanea() {
        return classificacaoCutanea;
    }

    public void setClassificacaoCutanea(EClassificacaoCutanea classificacaoCutanea) {
        this.classificacaoCutanea = classificacaoCutanea;
    }

    public EClassificacaoOleosidade getClassificacaoOleosidade() {
        return classificacaoOleosidade;
    }

    public void setClassificacaoOleosidade(EClassificacaoOleosidade classificacaoOleosidade) {
        this.classificacaoOleosidade = classificacaoOleosidade;
    }

    public EClassificacaoEspessura getClassificacaoEspessura() {
        return classificacaoEspessura;
    }

    public void setClassificacaoEspessura(EClassificacaoEspessura classificacaoEspessura) {
        this.classificacaoEspessura = classificacaoEspessura;
    }

    public EClassificacaoSensibilidade getClassificacaoSensibilidade() {
        return classificacaoSensibilidade;
    }

    public void setClassificacaoSensibilidade(EClassificacaoSensibilidade classificacaoSensibilidade) {
        this.classificacaoSensibilidade = classificacaoSensibilidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }

    public List<AnamneseFacial> getAnamnesesFaciais() {
        return anamnesesFaciais;
    }

    public void setAnamnesesFaciais(List<AnamneseFacial> anamnesesFaciais) {
        this.anamnesesFaciais = anamnesesFaciais;
    }
}
