package com.rafaeldev.clinicascrm.domain.models.pessoa;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_pessoa_juridica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaJuridica extends Pessoa{
    private String razaoSocial;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private boolean ehSimplesNacional;
}
