package com.rafaeldev.clinicascrm.repositories.agendamento;

import com.rafaeldev.clinicascrm.domain.models.procedimento.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Procedimento, Long> {
}
