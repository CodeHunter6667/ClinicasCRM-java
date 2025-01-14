package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tb_anamnese_facial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnamneseFacial extends Anamnese implements Serializable {
    @ManyToOne
    @JoinColumn(name = "avaliacao_facial_id")
    private AvaliacaoFacial avaliacaoFacial;
}
