package com.hopital.medecin.mapper;

import com.hopital.medecin.dto.MedecinDTO;
import com.hopital.medecin.Entities.Medecin;

public class MedecinMapper {

    public static MedecinDTO toDTO(Medecin medecin) {
        return MedecinDTO.builder()
                .id(medecin.getId())
                .nom(medecin.getNom())
                .specialite(medecin.getSpecialite())
                .email(medecin.getEmail())
                .build();
    }

    public static Medecin toEntity(MedecinDTO dto) {
        return Medecin.builder()
                .id(dto.getId())
                .nom(dto.getNom())
                .specialite(dto.getSpecialite())
                .email(dto.getEmail())
                .build();
    }
}
