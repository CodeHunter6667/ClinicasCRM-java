package com.rafaeldev.clinicascrm.repositories.pessoa;

import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
