package com.rafaeldev.clinicascrm.domain.models.consulta;

import com.rafaeldev.clinicascrm.domain.models.paciente.Habitos;
import com.rafaeldev.clinicascrm.domain.models.paciente.HistoricoPaciente;
import com.rafaeldev.clinicascrm.domain.models.pessoa.PessoaFisica;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_anamnese")
@Inheritance(strategy = InheritanceType.JOINED)
public class Anamnese implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaSalva;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica cliente;
    @ManyToOne
    @JoinColumn(name = "historico_paciente_id")
    private HistoricoPaciente historicoPaciente;
    @ManyToOne
    @JoinColumn(name = "habitos_id")
    private Habitos habitos;

    public Anamnese(Long id,
                    boolean estaSalva,
                    LocalDateTime dataCriacao,
                    LocalDateTime dataAlteracao,
                    PessoaFisica cliente,
                    HistoricoPaciente historicoPaciente,
                    Habitos habitos) {
        this.id = id;
        this.estaSalva = estaSalva;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.cliente = cliente;
        this.historicoPaciente = historicoPaciente;
        this.habitos = habitos;
    }

    public Anamnese() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEstaSalva() {
        return estaSalva;
    }

    public void setEstaSalva(boolean estaSalva) {
        this.estaSalva = estaSalva;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }

    public HistoricoPaciente getHistoricoPaciente() {
        return historicoPaciente;
    }

    public void setHistoricoPaciente(HistoricoPaciente historicoPaciente) {
        this.historicoPaciente = historicoPaciente;
    }

    public Habitos getHabitos() {
        return habitos;
    }

    public void setHabitos(Habitos habitos) {
        this.habitos = habitos;
    }
}
