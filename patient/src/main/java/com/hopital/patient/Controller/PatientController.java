package com.hopital.patient.Controller;

import com.hopital.patient.Entites.Patient;
import com.hopital.patient.Services.IService;
import com.hopital.patient.dto.PatientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hopital.patient.mappers.PatientMapper;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/patients")
@CrossOrigin
@RequiredArgsConstructor
public class PatientController {
@Autowired
   IService service;

    @PostMapping
    public PatientDTO ajouterPatient(@RequestBody PatientDTO patientDTO) {
        Patient patient = PatientMapper.toEntity(patientDTO);
        Patient saved = service.ajouterPatient(patient);
        return PatientMapper.toDTO(saved);
    }

    @GetMapping
    public List<PatientDTO> getPatients() {
        return service.getPatients()
                .stream()
                .map(PatientMapper::toDTO)
                .collect(Collectors.toList());
    }
}
