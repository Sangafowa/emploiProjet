package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projet")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_projet", updatable = false, nullable = false)
    private long  projetID ;

    @Column(name = "sigle_projet", nullable = false)
    private String sigle;

    @Column(name = "libelle_projet", nullable = false)
    private String libelle;
}
