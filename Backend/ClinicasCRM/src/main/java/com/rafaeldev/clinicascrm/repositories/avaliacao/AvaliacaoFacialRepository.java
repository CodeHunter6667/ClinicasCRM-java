package com.rafaeldev.clinicascrm.repositories.avaliacao;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFacialRepository extends JpaRepository<AvaliacaoFacial, Long> {
}
