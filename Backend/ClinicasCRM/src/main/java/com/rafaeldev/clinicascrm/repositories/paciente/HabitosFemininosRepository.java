package com.rafaeldev.clinicascrm.repositories.paciente;

import com.rafaeldev.clinicascrm.domain.models.paciente.HabitosFemininos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitosFemininosRepository extends JpaRepository<HabitosFemininos, Long> {
}
