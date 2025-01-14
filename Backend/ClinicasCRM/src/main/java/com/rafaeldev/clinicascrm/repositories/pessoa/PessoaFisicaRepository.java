package com.rafaeldev.clinicascrm.repositories.pessoa;

import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
