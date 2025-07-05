package com.hopital.medecin.feign;

import com.hopital.medecin.dto.PatientDTO;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PatientFeignClientFallBack implements PatientFeignClient {

    @Override
    public List<PatientDTO> getPatients() {
        System.out.println("⚠️ Service Patient indisponible - Fallback activé (getPatients) ⚠️");

        PatientDTO fallbackPatient = new PatientDTO();
        fallbackPatient.setMessage("Le service Patient est actuellement indisponible. Veuillez réessayer plus tard.");

        return List.of(fallbackPatient);
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        System.out.println("⚠️ Service Patient indisponible - Fallback activé (getPatientById) ⚠️");
        return null;
    }
}
