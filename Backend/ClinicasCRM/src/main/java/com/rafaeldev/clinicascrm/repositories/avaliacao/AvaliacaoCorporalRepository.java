package com.rafaeldev.clinicascrm.repositories.avaliacao;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoCorporalRepository extends JpaRepository<AvaliacaoCorporal, Long> {
}
