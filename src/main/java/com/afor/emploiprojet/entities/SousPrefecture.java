package com.afor.emploiprojet.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sousprefecture")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SousPrefecture {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sspref", updatable = false)
    private Long sousprefectureID;

    @Column(name = "nom")
    private String nom;


    @Column(name = "id_depart")
    private Long departementID;



    @ManyToOne
    @JoinColumn(name = "id_depart", insertable = false, updatable = false)
    private Departement departement;

}
