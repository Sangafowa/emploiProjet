package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "zoneIntervention")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZoneIntervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_region")
    private Long regionID;

    @Column(name = "id_projet")
    private long  projetID ;

    @Column(name = "sigle_of")
    private String sigle_of;

    @ManyToOne
    @JoinColumn(name = "id_region", insertable = false, updatable = false)
    private Region region;

    @ManyToOne
    @JoinColumn(name = "id_projet", insertable = false, updatable = false)
    private Projet projet;

    @ManyToOne
    @JoinColumn(name = "id_of", insertable = false, updatable = false)
    private OperateurFoncier operateurFoncier;
}
