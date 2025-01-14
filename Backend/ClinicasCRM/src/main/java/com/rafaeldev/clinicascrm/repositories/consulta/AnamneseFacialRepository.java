package com.rafaeldev.clinicascrm.repositories.consulta;

import com.rafaeldev.clinicascrm.domain.models.consulta.AnamneseFacial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamneseFacialRepository extends JpaRepository<AnamneseFacial, Long> {
}
