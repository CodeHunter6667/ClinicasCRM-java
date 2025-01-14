package com.rafaeldev.clinicascrm.repositories.paciente;

import com.rafaeldev.clinicascrm.domain.models.paciente.Habitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitosRepository extends JpaRepository<Habitos, Long> {
}
