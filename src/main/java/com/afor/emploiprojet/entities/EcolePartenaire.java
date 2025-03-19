package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ecolePartenaire")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcolePartenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_ecole", updatable = false, nullable = false)
    private long  ecoleID ;

    @Column(name = "sigle_ecole", nullable = false)
    private String sigle_ecole;

    @Column(name = "libelle_ecole", nullable = false)
    private String libelle_ecole;
}
