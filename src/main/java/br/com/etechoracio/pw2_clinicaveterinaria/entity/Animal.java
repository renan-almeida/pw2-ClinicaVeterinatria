package br.com.etechoracio.pw2_clinicaveterinaria.entity;

import br.com.etechoracio.pw2_clinicaveterinaria.enums.TipoAnimalEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ANIMAL")
public class Animal {
    @Id
    @Column(name = "IDANIMAL")
    private int id_Animal;

    @Column(name = "NOME_ANIMAL")
    private String nome_Animal;

    @Column(name = "TIPO")
    @Enumerated
    private TipoAnimalEnum tipo_Animal;

    @Column(name = "PESO", columnDefinition = "numeric")
    private double peso_Animal;

    @ManyToOne
    @JoinColumn(name = "DONO")
    private Cliente dono;



}
