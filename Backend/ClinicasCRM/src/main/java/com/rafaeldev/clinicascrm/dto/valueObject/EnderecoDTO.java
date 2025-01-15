package com.rafaeldev.clinicascrm.dto.valueObject;

import com.rafaeldev.clinicascrm.domain.valueObjects.Endereco;

public record EnderecoDTO(Long id,
                          String logradouro,
                          String numero,
                          String complemento,
                          String bairro,
                          String cidade,
                          String estado,
                          String cep) {

    public EnderecoDTO(Endereco entity){
        this(entity.getId(),
                entity.getLogradouro(),
                entity.getNumero(),
                entity.getComplemento(),
                entity.getBairro(),
                entity.getCidade(),
                entity.getEstado(),
                entity.getCep());
    }
}
