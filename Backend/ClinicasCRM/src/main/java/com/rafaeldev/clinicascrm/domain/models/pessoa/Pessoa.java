package com.rafaeldev.clinicascrm.domain.models.pessoa;

import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.valueObjects.Endereco;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String telefone;
    @Column(length = 100)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @Enumerated(EnumType.STRING)
    private ETipoCadastro cadastro;

    public Pessoa() {
    }

    public Pessoa(Long id,
                  String telefone,
                  String email,
                  Endereco endereco,
                  ETipoCadastro cadastro) {
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cadastro = cadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ETipoCadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(ETipoCadastro cadastro) {
        this.cadastro = cadastro;
    }
}
