package com.rafaeldev.clinicascrm.repositories.consulta;

import com.rafaeldev.clinicascrm.domain.models.consulta.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Long> {
}
