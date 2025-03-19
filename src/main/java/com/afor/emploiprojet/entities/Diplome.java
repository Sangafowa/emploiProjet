package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diplome")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diplome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_diplome", updatable = false, nullable = false)
    private long  diplomeID ;

    @Column(name = "libelle_diplome", nullable = false)
    private String libelle;
}
