package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fonction")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fonction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_fonction", updatable = false, nullable = false)
    private long  fonctionID ;

    @Column(name = "sigle_fonction", nullable = false)
    private String sigle_f;
}
