package com.rafaeldev.clinicascrm.repositories.procedimento;

import com.rafaeldev.clinicascrm.domain.models.procedimento.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {
}
