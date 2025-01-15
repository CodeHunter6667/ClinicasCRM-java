package com.rafaeldev.clinicascrm.domain.models.pessoa;

import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.models.agendamento.Agendamento;
import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import com.rafaeldev.clinicascrm.domain.enums.EGenero;
import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import com.rafaeldev.clinicascrm.domain.valueObjects.Endereco;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("FISICA")
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

    public PessoaFisica() {
    }

    public PessoaFisica(Long id,
                        String telefone,
                        String email,
                        Endereco endereco,
                        ETipoCadastro cadastro,
                        String nomeCompleto,
                        String cpf,
                        LocalDate dataNascimento,
                        EGenero genero,
                        Integer idade,
                        List<AvaliacaoCorporal> avaliacoesCorporais,
                        List<AvaliacaoFacial> avaliacoesFaciais,
                        List<Anamnese> anamneses,
                        List<Agendamento> agendamentos) {
        super(id, telefone, email, endereco, cadastro);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.idade = idade;
        this.avaliacoesCorporais = avaliacoesCorporais;
        this.avaliacoesFaciais = avaliacoesFaciais;
        this.anamneses = anamneses;
        this.agendamentos = agendamentos;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EGenero getGenero() {
        return genero;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<AvaliacaoCorporal> getAvaliacoesCorporais() {
        return avaliacoesCorporais;
    }

    public void setAvaliacoesCorporais(List<AvaliacaoCorporal> avaliacoesCorporais) {
        this.avaliacoesCorporais = avaliacoesCorporais;
    }

    public List<AvaliacaoFacial> getAvaliacoesFaciais() {
        return avaliacoesFaciais;
    }

    public void setAvaliacoesFaciais(List<AvaliacaoFacial> avaliacoesFaciais) {
        this.avaliacoesFaciais = avaliacoesFaciais;
    }

    public List<Anamnese> getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(List<Anamnese> anamneses) {
        this.anamneses = anamneses;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
