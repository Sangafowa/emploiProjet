package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departement")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_depart", updatable = false)
    private Long departementID;

    @Column(name = "nom")
    private String nom;

    @Column(name = "id_region")
    private Long regionID;



    @ManyToOne
    @JoinColumn(name = "id_region", insertable = false, updatable = false)
    private Region region;


    public Departement(long departementID, String nom, long regionID) {
        this.departementID = departementID;
        this.nom = nom;
        this.regionID = regionID;
    }
}
