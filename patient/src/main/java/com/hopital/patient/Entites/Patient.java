package com.hopital.patient.Entites;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Document(collection = "patients") // Nom de la collection dans MongoDB
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    private String id; // MongoDB utilise des String comme identifiants par défaut

    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    private String adresse;

    private String telephone;
}
