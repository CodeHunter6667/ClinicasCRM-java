package com.rafaeldev.clinicascrm.dto.pessoa;

import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaJuridica;
import com.rafaeldev.clinicascrm.dto.valueObject.EnderecoDTO;

public record PessoaJuridicaMinDTO(Long id,
                                   String razaoSocial,
                                   String cnpj,
                                   String inscricaoEstadual,
                                   String inscricaoMunicipal,
                                   boolean ehSimplesNacional,
                                   String telefone,
                                   String email,
                                   EnderecoDTO endereco,
                                   ETipoCadastro cadastro) {

    public PessoaJuridicaMinDTO(PessoaJuridica pessoaJuridica){
        this(pessoaJuridica.getId(),
             pessoaJuridica.getRazaoSocial(),
             pessoaJuridica.getCnpj(),
             pessoaJuridica.getInscricaoEstadual(),
             pessoaJuridica.getInscricaoMunicipal(),
             pessoaJuridica.isEhSimplesNacional(),
             pessoaJuridica.getTelefone(),
             pessoaJuridica.getEmail(),
             new EnderecoDTO(pessoaJuridica.getEndereco()),
             pessoaJuridica.getCadastro());
    }
}
