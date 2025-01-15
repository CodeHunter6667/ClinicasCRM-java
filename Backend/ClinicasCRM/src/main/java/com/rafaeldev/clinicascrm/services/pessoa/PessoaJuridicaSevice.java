package com.rafaeldev.clinicascrm.services.pessoa;

import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaJuridica;
import com.rafaeldev.clinicascrm.dto.pessoa.PessoaJuridicaMinDTO;
import com.rafaeldev.clinicascrm.exception.ResourceNotFoundException;
import com.rafaeldev.clinicascrm.repositories.pessoa.PessoaJuridicaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaJuridicaSevice {

    @Autowired
    private PessoaJuridicaRepository repository;

    @Transactional(readOnly = true)
    public List<PessoaJuridicaMinDTO> getAll(){
        var pessoas = repository.findAll();
        return pessoas.stream().map(PessoaJuridicaMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public PessoaJuridicaMinDTO getById(Long id){
        var pessoa = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Pessoa não encontrada")
        );
        return new PessoaJuridicaMinDTO(pessoa);
    }

    @Transactional
    public PessoaJuridicaMinDTO insert(PessoaJuridicaMinDTO dto){
        PessoaJuridica pessoa = new PessoaJuridica();
        copyDtoDoEntity(pessoa, dto);
        pessoa = repository.save(pessoa);
        return new PessoaJuridicaMinDTO(pessoa);
    }

    @Transactional
    public PessoaJuridicaMinDTO update(Long id, PessoaJuridicaMinDTO dto){
        try {
            var pessoa = repository.getReferenceById(id);
            copyDtoDoEntity(pessoa, dto);
            pessoa = repository.save(pessoa);
            return new PessoaJuridicaMinDTO(pessoa);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Pessoa não encontrada");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if(!repository.existsById(id))
            throw new ResourceNotFoundException("Pessoa não encontrada");
        repository.deleteById(id);
    }

    private void copyDtoDoEntity(PessoaJuridica entity, PessoaJuridicaMinDTO dto){
        entity.setId(dto.id());
        entity.setRazaoSocial(dto.razaoSocial());
        entity.setCnpj(dto.cnpj());
        entity.setInscricaoEstadual(dto.inscricaoEstadual());
        entity.setInscricaoMunicipal(dto.inscricaoMunicipal());
        entity.setEhSimplesNacional(dto.ehSimplesNacional());
        entity.setTelefone(dto.telefone());
        entity.setEmail(dto.email());
        entity.setEndereco(dto.endereco());
        entity.setCadastro(dto.cadastro());
    }
}
