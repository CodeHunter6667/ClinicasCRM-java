package com.rafaeldev.clinicascrm.domain.models.pessoa;

import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.valueObjects.Endereco;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("JURIDICA")
public class PessoaJuridica extends Pessoa implements Serializable {
    @Column(length = 200, nullable = false)
    private String razaoSocial;
    @Column(length = 30, nullable = false)
    private String cnpj;
    @Column(length = 30)
    private String inscricaoEstadual;
    @Column(length = 30)
    private String inscricaoMunicipal;
    private boolean ehSimplesNacional;

    public PessoaJuridica(Long id,
                          String telefone,
                          String email,
                          Endereco endereco,
                          ETipoCadastro cadastro,
                          String razaoSocial,
                          String cnpj,
                          String inscricaoEstadual,
                          String inscricaoMunicipal,
                          boolean ehSimplesNacional) {
        super(id, telefone, email, endereco, cadastro);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.ehSimplesNacional = ehSimplesNacional;
    }

    public PessoaJuridica() {
        super();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public boolean isEhSimplesNacional() {
        return ehSimplesNacional;
    }

    public void setEhSimplesNacional(boolean ehSimplesNacional) {
        this.ehSimplesNacional = ehSimplesNacional;
    }
}
