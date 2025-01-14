package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tb_anamnese_corporal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnamneseCorporal extends Anamnese implements Serializable {
    @ManyToOne
    @JoinColumn(name = "avaliacao_corporal_id")
    private AvaliacaoCorporal avaliacaoCorporal;
}
