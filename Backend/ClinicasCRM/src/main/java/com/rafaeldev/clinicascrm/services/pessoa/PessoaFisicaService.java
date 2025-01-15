package com.rafaeldev.clinicascrm.services.pessoa;

import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import com.rafaeldev.clinicascrm.dto.pessoa.PessoaFisicaMinDTO;
import com.rafaeldev.clinicascrm.exception.ResourceNotFoundException;
import com.rafaeldev.clinicascrm.repositories.pessoa.PessoaFisicaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaFisicaService {

    @Autowired
    private PessoaFisicaRepository repository;

    @Transactional(readOnly = true)
    public List<PessoaFisicaMinDTO> getAll() {
        var pessoas = repository.findAll();
        return pessoas.stream().map(PessoaFisicaMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public PessoaFisicaMinDTO getById(Long id) {
        var pessoa = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Pessoa não encontrada"));
        return new PessoaFisicaMinDTO(pessoa);
    }

    @Transactional
    public PessoaFisicaMinDTO insert(PessoaFisicaMinDTO dto){
        PessoaFisica pessoaFisica = new PessoaFisica();
        copyDtoToEntity(dto, pessoaFisica);
        pessoaFisica = repository.save(pessoaFisica);
        return new PessoaFisicaMinDTO(pessoaFisica);
    }

    @Transactional
    public PessoaFisicaMinDTO update(Long id, PessoaFisicaMinDTO dto){
        try{
            PessoaFisica pessoaFisica = repository.getReferenceById(id);
            copyDtoToEntity(dto, pessoaFisica);
            pessoaFisica = repository.save(pessoaFisica);
            return new PessoaFisicaMinDTO(pessoaFisica);
        } catch(EntityNotFoundException e){
            throw new ResourceNotFoundException("Pessoa não encontrada");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Pessoa não encontrada");
        }
        repository.deleteById(id);
    }

    private void copyDtoToEntity(PessoaFisicaMinDTO dto, PessoaFisica entity){
        entity.setId(dto.id());
        entity.setTelefone(dto.telefone());
        entity.setEmail(dto.email());
        entity.setEndereco(dto.endereco());
        entity.setCadastro(dto.cadastro());
        entity.setNomeCompleto(dto.nomeCompleto());
        entity.setCpf(dto.cpf());
        entity.setDataNascimento(dto.dataNascimento());
        entity.setGenero(dto.genero());
        entity.setIdade(dto.idade());
    }
}
