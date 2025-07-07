package com.hopital.patient.Controller;

import com.hopital.patient.Entites.Patient;
import com.hopital.patient.Services.IService;
import com.hopital.patient.Services.PatientEventProducer;
import com.hopital.patient.dto.PatientDTO;
import com.hopital.patient.dto.MedecinDTO;
import com.hopital.patient.mappers.PatientMapper;
import com.hopital.patient.Services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
@CrossOrigin
public class PatientController {
    @Autowired
    private PatientEventProducer productEventProducer;
    private final IService service;
    private final PatientService patientService;
    private final PatientEventProducer patientEventProducer;

    // Ajouter un patient
    @PostMapping
    public PatientDTO ajouterPatient(@RequestBody PatientDTO patientDTO) {
        Patient patient = PatientMapper.toEntity(patientDTO);
        Patient saved = service.ajouterPatient(patient);
        PatientDTO savedDTO = PatientMapper.toDTO(saved);

        // Envoi de l'événement Kafka après création du patient
        patientEventProducer.sendPatientCreatedEvent(savedDTO);

        return savedDTO;
    }

    // Récupérer tous les patients
    @GetMapping
    public List<PatientDTO> getPatients() {
        return service.getPatients()
                .stream()
                .map(PatientMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Récupérer tous les médecins
    @GetMapping("/medecins")
    public List<MedecinDTO> getMedecins() {
        return patientService.getAllMedecins();
    }
}
