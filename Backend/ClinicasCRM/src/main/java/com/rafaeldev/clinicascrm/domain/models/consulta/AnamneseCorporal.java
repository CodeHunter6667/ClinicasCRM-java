package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_anamnese_corporal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnamneseCorporal extends Anamnese{
    @OneToOne
    @JoinColumn(name = "avaliacao_corporal_id")
    private AvaliacaoCorporal avaliacaoCorporal;
}
