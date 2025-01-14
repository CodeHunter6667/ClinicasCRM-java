package com.rafaeldev.clinicascrm.domain.models.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tb_pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("JURIDICA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
