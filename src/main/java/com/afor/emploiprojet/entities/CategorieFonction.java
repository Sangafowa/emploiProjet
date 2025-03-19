package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorieFonction")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategorieFonction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_categorie", updatable = false, nullable = false)
    private long  categorieID ;

    @Column(name = "sigle_fonction", nullable = false)
    private String sigle_categorie;
}
