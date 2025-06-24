package com.hopital.medecin.dto;
import com.hopital.medecin.Entities.Specialite;
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
