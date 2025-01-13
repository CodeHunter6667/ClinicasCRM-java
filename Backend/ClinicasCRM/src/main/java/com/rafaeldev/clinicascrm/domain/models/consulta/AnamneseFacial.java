package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_anamnese_facial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnamneseFacial extends Anamnese{
    @OneToOne
    @JoinColumn(name = "avaliacao_facial_id")
    private AvaliacaoFacial avaliacaoFacial;
}
