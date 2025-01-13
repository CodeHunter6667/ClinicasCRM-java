package com.rafaeldev.clinicascrm.domain.models.pessoa;

import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoCorporal;
import com.rafaeldev.clinicascrm.domain.models.avaliacao.AvaliacaoFacial;
import com.rafaeldev.clinicascrm.domain.enums.EGenero;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_pessoa_fisica")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa{
    private String nomeCompleto;
    private String cpf;
    private LocalDateTime dataNascimento;
    private EGenero genero;
    private Integer idade = calcularIdade();
    @OneToMany(mappedBy = "cliente")
    private List<AvaliacaoCorporal> avaliacoesCorporais = new ArrayList<>();
    @OneToMany(mappedBy = "cliente")
    private List<AvaliacaoFacial> avaliacoesFaciais = new ArrayList<>();

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
