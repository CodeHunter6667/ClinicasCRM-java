package com.rafaeldev.clinicascrm.domain.models.paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "tb_habitos_femininos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitosFemininos extends Habitos implements Serializable {
    private boolean cicloMenstrualRegular;
    private boolean usoAnticoncepcionalRegular;
    private boolean gestante;
    private boolean lactante;
    private boolean temFilhos;
    private Integer quantosFilhos;
}
