package com.rafaeldev.clinicascrm.dto.pessoa;

import com.rafaeldev.clinicascrm.domain.enums.EGenero;
import com.rafaeldev.clinicascrm.domain.enums.ETipoCadastro;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.dto.valueObject.EnderecoDTO;

import java.time.LocalDate;

public record PessoaFisicaMinDTO(Long id,
                                 String telefone,
                                 String email,
                                 EnderecoDTO endereco,
                                 ETipoCadastro cadastro,
                                 String nomeCompleto,
                                 String cpf,
                                 LocalDate dataNascimento,
                                 EGenero genero,
                                 Integer idade) {

    public PessoaFisicaMinDTO(PessoaFisica pessoaFisica) {
        this(pessoaFisica.getId(),
                pessoaFisica.getTelefone(),
                pessoaFisica.getEmail(),
                new EnderecoDTO(pessoaFisica.getEndereco()),
                pessoaFisica.getCadastro(),
                pessoaFisica.getNomeCompleto(),
                pessoaFisica.getCpf(),
                pessoaFisica.getDataNascimento(),
                pessoaFisica.getGenero(),
                pessoaFisica.getIdade());
    }
}
