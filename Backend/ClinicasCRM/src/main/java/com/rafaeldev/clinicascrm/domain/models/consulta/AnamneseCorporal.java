package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import com.rafaeldev.clinicascrm.domain.models.paciente.Habitos;
import com.rafaeldev.clinicascrm.domain.models.paciente.HistoricoPaciente;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_anamnese_corporal")
public class AnamneseCorporal extends Anamnese implements Serializable {
    @ManyToOne
    @JoinColumn(name = "avaliacao_corporal_id")
    private AvaliacaoCorporal avaliacaoCorporal;

    public AnamneseCorporal(Long id,
                            boolean estaSalva,
                            LocalDateTime dataCriacao,
                            LocalDateTime dataAlteracao,
                            PessoaFisica cliente,
                            HistoricoPaciente historicoPaciente,
                            Habitos habitos,
                            AvaliacaoCorporal avaliacaoCorporal) {
        super(id, estaSalva, dataCriacao, dataAlteracao, cliente, historicoPaciente, habitos);
        this.avaliacaoCorporal = avaliacaoCorporal;
    }

    public AnamneseCorporal(AvaliacaoCorporal avaliacaoCorporal) {
        this.avaliacaoCorporal = avaliacaoCorporal;
    }

    public AnamneseCorporal() {
    }

    public AvaliacaoCorporal getAvaliacaoCorporal() {
        return avaliacaoCorporal;
    }

    public void setAvaliacaoCorporal(AvaliacaoCorporal avaliacaoCorporal) {
        this.avaliacaoCorporal = avaliacaoCorporal;
    }
}
