package com.hopital.patient.Controller;

import com.hopital.patient.Entites.Patient;
import com.hopital.patient.Services.IService;
import com.hopital.patient.dto.PatientDTO;
import com.hopital.patient.dto.MedecinDTO;
import com.hopital.patient.mappers.PatientMapper;
import com.hopital.patient.Services.PatientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/patients")
@CrossOrigin
public class PatientController {

 IService service;
     PatientService patientService;

    // Ajouter un patient
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


    @GetMapping("/medecins")
    public List<MedecinDTO> getMedecins() {
        return patientService.getAllMedecins();
    }
}
