package com.rafaeldev.clinicascrm.domain.models.paciente;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tb_habitos_femininos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitosFemininos extends Habitos{
    private boolean cicloMenstrualRegular;
    private boolean usoAnticoncepcionalRegular;
    private boolean gestante;
    private boolean lactante;
    private boolean temFilhos;
    private Integer quantosFilhos;
}
