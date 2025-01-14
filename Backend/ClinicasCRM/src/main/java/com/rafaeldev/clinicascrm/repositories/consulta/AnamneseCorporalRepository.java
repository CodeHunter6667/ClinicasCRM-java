package com.rafaeldev.clinicascrm.repositories.consulta;

import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseCorporal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamneseCorporalRepository extends JpaRepository<AnamneseCorporal, Long> {
}
