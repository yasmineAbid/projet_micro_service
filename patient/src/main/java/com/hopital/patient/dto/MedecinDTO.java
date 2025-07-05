package com.hopital.patient.dto;

import com.hopital.patient.Entites.Specialite;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedecinDTO {




        private Long id;
        private String nom;
        private Specialite specialite;
        private String email;
}
