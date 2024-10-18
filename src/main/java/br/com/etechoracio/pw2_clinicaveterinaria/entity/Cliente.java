package br.com.etechoracio.pw2_clinicaveterinaria.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CLIENTE")

public class Cliente {
    @Id
    @Column(name = "IDTUTOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutor;

    @Column(name = "NOME_TUTOR")
    private String nome_Tutor;

    @Column(name = "CELULAR_TUTOR")
    private String celular_Tutor;

    @Column(name = "CPF_TUTOR")
    private String cpf_Tutor;
}
