package com.hopital.medecin.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    private String email;
}
