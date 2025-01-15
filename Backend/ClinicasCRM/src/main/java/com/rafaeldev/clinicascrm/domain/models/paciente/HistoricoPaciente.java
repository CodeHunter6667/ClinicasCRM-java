package com.rafaeldev.clinicascrm.domain.models.paciente;

import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_historico_paciente")
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

    public HistoricoPaciente(Long id,
                             boolean estaSalva,
                             LocalDateTime dataCriacao,
                             LocalDateTime dataAlteracao,
                             String tratamentosAnteriores,
                             String alergias,
                             String tratamentosOncologicos,
                             boolean hipertensao,
                             boolean diabetes,
                             boolean problemasCardiacos,
                             boolean marcapasso,
                             boolean protesesMetalicas,
                             boolean protesesdentarias,
                             boolean epilepsia,
                             boolean fazTratamentoMedico,
                             List<Anamnese> anamneses) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.tratamentosAnteriores = tratamentosAnteriores;
        this.alergias = alergias;
        this.tratamentosOncologicos = tratamentosOncologicos;
        this.hipertensao = hipertensao;
        this.diabetes = diabetes;
        this.problemasCardiacos = problemasCardiacos;
        this.marcapasso = marcapasso;
        this.protesesMetalicas = protesesMetalicas;
        this.protesesdentarias = protesesdentarias;
        this.epilepsia = epilepsia;
        this.fazTratamentoMedico = fazTratamentoMedico;
        this.anamneses = anamneses;
    }

    public HistoricoPaciente() {
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

    public String getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    public void setTratamentosAnteriores(String tratamentosAnteriores) {
        this.tratamentosAnteriores = tratamentosAnteriores;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTratamentosOncologicos() {
        return tratamentosOncologicos;
    }

    public void setTratamentosOncologicos(String tratamentosOncologicos) {
        this.tratamentosOncologicos = tratamentosOncologicos;
    }

    public boolean isHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(boolean hipertensao) {
        this.hipertensao = hipertensao;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public boolean isMarcapasso() {
        return marcapasso;
    }

    public void setMarcapasso(boolean marcapasso) {
        this.marcapasso = marcapasso;
    }

    public boolean isProtesesMetalicas() {
        return protesesMetalicas;
    }

    public void setProtesesMetalicas(boolean protesesMetalicas) {
        this.protesesMetalicas = protesesMetalicas;
    }

    public boolean isProtesesdentarias() {
        return protesesdentarias;
    }

    public void setProtesesdentarias(boolean protesesdentarias) {
        this.protesesdentarias = protesesdentarias;
    }

    public boolean isEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public boolean isFazTratamentoMedico() {
        return fazTratamentoMedico;
    }

    public void setFazTratamentoMedico(boolean fazTratamentoMedico) {
        this.fazTratamentoMedico = fazTratamentoMedico;
    }

    public List<Anamnese> getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(List<Anamnese> anamneses) {
        this.anamneses = anamneses;
    }
}
