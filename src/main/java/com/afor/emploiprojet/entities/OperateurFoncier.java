package com.afor.emploiprojet.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "operateurFoncier")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperateurFoncier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_of", updatable = false, nullable = false)
    private long  operateurFID ;

    @Column(name = "sigle_of", nullable = false)
    private String sigle_of;

    @Column(name = "libelle_of", nullable = false)
    private String libelle_of;

    @Column(name = "contact_of", nullable = false)
    private String contact_of;

    @Column(name = "mail_of", nullable = false)
    private String email_of;

}
