package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import com.rafaeldev.clinicascrm.domain.models.paciente.Habitos;
import com.rafaeldev.clinicascrm.domain.models.paciente.HistoricoPaciente;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_anamnese_facial")
public class AnamneseFacial extends Anamnese implements Serializable {
    @ManyToOne
    @JoinColumn(name = "avaliacao_facial_id")
    private AvaliacaoFacial avaliacaoFacial;

    public AnamneseFacial(Long id,
                          boolean estaSalva,
                          LocalDateTime dataCriacao,
                          LocalDateTime dataAlteracao,
                          PessoaFisica cliente,
                          HistoricoPaciente historicoPaciente,
                          Habitos habitos) {
        super(id, estaSalva, dataCriacao, dataAlteracao, cliente, historicoPaciente, habitos);
    }

    public AnamneseFacial() {
        super();
    }

    public AnamneseFacial(AvaliacaoFacial avaliacaoFacial) {
        this.avaliacaoFacial = avaliacaoFacial;
    }

    public AvaliacaoFacial getAvaliacaoFacial() {
        return avaliacaoFacial;
    }

    public void setAvaliacaoFacial(AvaliacaoFacial avaliacaoFacial) {
        this.avaliacaoFacial = avaliacaoFacial;
    }
}
