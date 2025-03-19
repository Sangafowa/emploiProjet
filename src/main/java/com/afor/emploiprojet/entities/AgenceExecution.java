package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "agenceExecution")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgenceExecution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_agence", updatable = false, nullable = false)
    private long  agenceID ;

    @Column(name = "sigle_agence", nullable = false)
    private String sigle_agence;

    @Column(name = "libelle_agence", nullable = false)
    private String libelle_agence;
}
