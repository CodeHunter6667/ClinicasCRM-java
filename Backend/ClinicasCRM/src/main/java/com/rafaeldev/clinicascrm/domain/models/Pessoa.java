package com.rafaeldev.clinicascrm.domain.models;

import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.valueObjects.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_pessoa")
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefone;
    private String email;
    @OneToOne(mappedBy = "pessoa")
    private Endereco endereco;
    private ETipoCadastro cadastro;
    @OneToMany(mappedBy = "pessoa")
    private List<PessoaFisica> pessoaFisica;
    @OneToMany(mappedBy = "pessoa")
    private List<PessoaJuridica> pessoaJuridica;
}
