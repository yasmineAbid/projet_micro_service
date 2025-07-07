package com.hopital.medecin.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String dateNaissance; // en String, sinon `LocalDate` si déjà géré
}


