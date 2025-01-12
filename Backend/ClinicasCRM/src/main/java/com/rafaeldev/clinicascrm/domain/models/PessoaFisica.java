package com.rafaeldev.clinicascrm.domain.models;

import com.rafaeldev.clinicascrm.domain.enums.EGenero;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "tb_cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa{
    private String nomeCompleto;
    private String cpf;
    private LocalDateTime dataNascimento;
    private EGenero genero;
    private Integer idade = calcularIdade();
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    private Integer calcularIdade() {
        if (dataNascimento != null) {
            var hoje = LocalDateTime.now();
            var idade = hoje.getYear() - dataNascimento.getYear();
            if (dataNascimento.getDayOfYear() > hoje.getDayOfYear()) {
                idade--;
            }
            return idade;
        }
        return null;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }
}
