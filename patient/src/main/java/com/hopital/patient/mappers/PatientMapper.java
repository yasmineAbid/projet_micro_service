package com.hopital.patient.mappers;

import com.hopital.patient.dto.PatientDTO;
import com.hopital.patient.Entites.Patient;

public class PatientMapper {

    public static PatientDTO toDTO(Patient patient) {
        return PatientDTO.builder()
                .id(patient.getId())
                .nom(patient.getNom())
                .prenom(patient.getPrenom())
                .dateNaissance(patient.getDateNaissance())
                .adresse(patient.getAdresse())
                .telephone(patient.getTelephone())
                .build();
    }

    public static Patient toEntity(PatientDTO dto) {
        return Patient.builder()
                .id(dto.getId())
                .nom(dto.getNom())
                .prenom(dto.getPrenom())
                .dateNaissance(dto.getDateNaissance())
                .adresse(dto.getAdresse())
                .telephone(dto.getTelephone())
                .build();
    }
}
