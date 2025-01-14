package com.rafaeldev.clinicascrm.repositories.paciente;

import com.rafaeldev.clinicascrm.domain.models.paciente.Medidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedidasRepository extends JpaRepository<Medidas, Long> {
}
